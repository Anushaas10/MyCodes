package Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 0, -1};
        System.out.println(maxProduct(arr));
    }

//    static int maxProduct(int[] arr) {
//        int mul=0;
//        for (int i = 0; i < arr.length; i++) {
//            int product=1;
//            for (int j = i; j < arr.length; j++) {
//                product= product*arr[j];
//                mul=Math.max(mul,product);
//            }
//        }
//        return mul;
//    }
    static int maxProduct(int[] nums) {
        int n=nums.length;
        int lefttoRight = 1;
        int righttoLeft = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(lefttoRight ==0){
                lefttoRight = 1;
            }
            if(righttoLeft ==0){
                righttoLeft = 1;
            }
            lefttoRight = lefttoRight * nums[i];
            righttoLeft = righttoLeft * nums[n-i-1];
            maxProduct = Math.max(lefttoRight, Math.max(righttoLeft, maxProduct));
        }
        return maxProduct;
    }
}
