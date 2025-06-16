package BinarySearch;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2};
        System.out.println(findMin(arr)); // Output: 1
    }

    static int findMin(int[] nums) {
        int pivot = searchPivot(nums);
        if (pivot == -1) {
            return nums[0]; // Array is not rotated
        }
        return nums[pivot + 1]; // The minimum element is at pivot + 1
    }

    static int searchPivot(int[] arr) {
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
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
