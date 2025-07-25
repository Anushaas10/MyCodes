package Sorting;

public class findMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int missingPositive = firstMissingPositive(nums);
        System.out.println(missingPositive); // Output: 2
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
