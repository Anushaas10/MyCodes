package Arrays;

//You are given two positive integers n and limit.
//
//Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.


public class DistributeCandiesII {
    public static void main(String[] args) {
        int n = 5;
        int limit = 2;
        System.out.println(distributeCandies(n, limit));
    }

    static long distributeCandies(int n, int limit) {
//        long res = 0;
//        for (int i = 0; i <= Math.min(limit, n); i++) {
//            if (n - i <= 2 * limit)
//                res += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
//        }
//        return res;
        return combCount(n)
                - 3 * combCount(n - (limit + 1))
                + 3 * combCount(n - 2 * (limit + 1))
                - combCount(n - 3 * (limit + 1));
    }
    static long combCount(long sum) {
        if (sum < 0) return 0;
        return (sum + 2) * (sum + 1) / 2;
    }
}
