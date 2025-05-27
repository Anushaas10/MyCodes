package Arrays;

import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(Arrays.toString(rotateArray(arr, 3)));
    }

    static int[] rotateArray(int[] arr, int d) {
        int n= arr.length;
        int[] result= new int[n];
        for(int i=0; i<arr.length; i++){
            if(i<d){
                result[n-d+i]= arr[i];
            }
            else{
                result[i-d]=arr[i];
            }
        }
        for(int j=0; j<n; j++){
            arr[j] = result[j];
        }

        return arr;
    }
}
