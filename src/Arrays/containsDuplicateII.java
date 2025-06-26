package Arrays;

public class containsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 2, 5};
    }

    static boolean check(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}
