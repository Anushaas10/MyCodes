package Sorting;

import java.util.List;
import java.util.ArrayList;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        List<Integer> missingNumbers = findDisappearedNumbers(nums);
        System.out.println(missingNumbers); // Output: [5, 6]
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                res.add(index + 1);
            }
        }
        return res;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

