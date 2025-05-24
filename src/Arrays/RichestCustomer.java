package Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
        }
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > 0 && sum[i] > sum[i - 1]) {
                max = sum[i];
            }
        }
        return max;
    }
}

