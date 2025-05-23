package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 7, 0, 0, 0, 0};
        int[] nums2 = {4, 45, 50, 60};
        System.out.println(Arrays.toString(merge(nums1, 4, nums2, 4)));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        for (int j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
