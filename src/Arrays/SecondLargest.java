package Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {1, 17, 34, 6, 7, 40};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i : arr) {
            if (i > max1) max1 = i;
        }
        for(int i : arr) {
            if (i > max2 && i!=max1) max2 = i;
        }
        return max2;
    }
}
