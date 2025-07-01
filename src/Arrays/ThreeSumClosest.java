package Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target)); // Output: 2
    }

    private static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    int currentDiff = Math.abs(currentSum - target);

                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                        closestSum = currentSum;
                    }
                }
            }
        }

        return closestSum;
    }
}
