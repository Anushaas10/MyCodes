package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
// This code counts the number of smaller elements to the right of each element in an array.
public class CountSmallerNumbers {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        System.out.println(countSmaller(nums));
    }

    static List<Integer> countSmaller(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int ind = number(sorted, nums[i]);
            li.add(ind);
            sorted.add(ind, nums[i]);
        }
        Collections.reverse(li);
        return li;
    }

    static int number(List<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
