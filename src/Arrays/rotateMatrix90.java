package Arrays;
import java.util.Arrays;

public class rotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    static void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0; i<n; i++){
            reverse(matrix[i], n);
        }
    }

    static void reverse(int[] matrix, int n){
        int start=0;
        int end= n-1;
        while(start<end){
            swap(matrix, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] matrix, int i, int j){
        int temp= matrix[i];
        matrix[i]= matrix[j];
        matrix[j]= temp;
    }
}
