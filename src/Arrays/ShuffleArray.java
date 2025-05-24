package Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < 2 * n; i += 2) {
            result[i] = nums[i / 2];
        }
        for (int i = 1; i < 2 * n; i += 2) {
            result[i] = nums[n - 1 + (i + 1) / 2];
        }
        return result;
    }
}
