package BinarySearch;

public class KthMissingNoInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(kthMissing(arr, k)); // Output: 8
    }

    static int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int res = arr.length + k; // Maximum possible value of kth missing number
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) >= k) {
                res = mid + k;
                end = mid - 1;
            } // Search in the left half
             else {
                start = mid + 1; // Search in the right half
            }
        }
        return res;
    }
}
