package BinarySearch;

import java.util.Arrays;
//You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

public class gfgAgressiveCows {
    public static void main(String[] args) {
        int[] stalls = {2, 12, 11, 3, 26, 7};
        int k = 5;
        System.out.println(aggressiveCows(stalls, k));
    }

    static boolean check(int[] stalls, int k, int dist) {

        // Place first cow at 0th index
        int cnt = 1;
        int prev = stalls[0];
        for (int i = 1; i < stalls.length; i++) {

            // If the current stall is at least dist away
            // from the previous one place the cow here
            if (stalls[i] - prev >= dist) {
                prev = stalls[i];
                cnt++;
            }
        }
        return (cnt >= k);
    }

    static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int res = 0;

        // Search Space for Binary Search
        int lo = 1;
        int hi = stalls[stalls.length - 1] - stalls[0];

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // If the mid-distance is possible, update
            // the result and search for larger distance
            if (check(stalls, k, mid)) {
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return res;

    }
}
