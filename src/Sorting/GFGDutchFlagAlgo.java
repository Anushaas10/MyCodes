package Sorting;

import java.util.Arrays;

//The Dutch National Flag Algorithm, also known as the DNF algorithm or the Three-Way Partitioning Algorithm, is a sorting algorithm designed to segregate an array containing three distinct elements
public class GFGDutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
