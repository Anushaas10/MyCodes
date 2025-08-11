package Arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-3, -2};
        System.out.println(maxSubarraySum(arr));
    }

    static int maxSubarraySum(int[] arr) {
        int sum = arr[0], max_sum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            max_sum= Math.max(max_sum, sum);
        }
        return max_sum;
    }
}
