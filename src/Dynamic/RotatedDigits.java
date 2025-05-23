package Dynamic;

public class RotatedDigits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rotatedDigits(n));
    }

    static int rotatedDigits(int n) {
        int[] dp = new int[n + 1];
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i < 10) {
                if (i == 0 || i == 1 || i == 8) dp[i] = 1;
                else if (i == 2 || i == 5 || i == 6 || i == 9) {
                    dp[i] = 2;
                    count++;
                }
            } else {
                int a = dp[i / 10], b = dp[i % 10];
                if (a == 1 && b == 1) dp[i] = 1;
                else if (a >= 1 && b >= 1) {
                    dp[i] = 2;
                    count++;
                }
            }
        }
        return count;
    }

}
