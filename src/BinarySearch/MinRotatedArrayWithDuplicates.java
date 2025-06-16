package BinarySearch;

public class MinRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 0, 1};
        System.out.println(findMin(arr)); // Output: 0
    }

    static int findMin(int[] nums) {
        //a rather efficient method to find the minimum in a rotated sorted array with duplicates
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid-element is greater than right, minimum is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // If mid-element is less than right, minimum is in left half or at mid
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
            // If equal, we cannot determine, but can exclude rightmost element
            else {
                right--;
            }
        }

        return nums[left];
//        int pivot = findPivotWithDuplicates(arr);
//        if (pivot == -1) {
//            return arr[0]; // Array is not rotated
//        }
//        return arr[pivot + 1]; // Minimum element is the next element after the pivot
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Skip duplicates
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found
    }
}
