package Arrays;

public class CircularSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-7, 32, -11, 21, 18, 35, -26, -17, 35, -12, -38, -33, 32, 16, 44, 11, -40, -21, 2, 27, -35, 21, -37, -12, 1};
        System.out.println(circularSubarraySum(arr));
    }

    static int circularSubarraySum(int arr[]) {
        int totalsum = 0, maxsum = 0, minsum = 0, sum = 0;
        int currmax = 0, currmin = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];

            //Kandane's to find min subarray
            currmin = Math.min(currmin + arr[i], arr[i]);
            minsum = Math.min(minsum, currmin);

            //Kandane's to find max subarray
            currmax = Math.max(currmax + arr[i], arr[i]);
            maxsum = Math.max(maxsum, currmax);
        }
        if(maxsum==minsum) {
            return minsum;
        }

        sum = totalsum - minsum;
        return Math.max(sum, maxsum);
    }

}
