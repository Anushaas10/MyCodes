package BinarySearch;

public class RotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        System.out.println(search(arr, 0)); // Output: true
        System.out.println(search(arr, 3)); // Output: false
    }

    static boolean search(int[] arr, int target) {
        int pivot = SearchPivotWithDuplicates(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (target == arr[pivot]) {
            return true;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    static int SearchPivotWithDuplicates(int[] arr) {
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
//                skip duplicates
//                maybe start is the pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
//                check if end is the pivot
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start]<arr[mid]  ||( arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
