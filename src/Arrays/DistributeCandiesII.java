package Arrays;

public class DistributeCandiesII {
    public static void main(String[] args) {
        int n = 5;
        int limit = 2;
        System.out.println(distributeCandies(n, limit));
    }

    static long distributeCandies(int n, int limit) {
        long res = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            if (n - i <= 2 * limit)
                res += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }
        return res;
        
    }
}
