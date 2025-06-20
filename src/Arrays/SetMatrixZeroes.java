package Arrays;

import java.util.Arrays;

/**Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

 You must do it in place.**/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    static void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols= new boolean[matrix[0].length];
        // First pass: mark the rows and columns that need to be zeroed
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        // Second pass: set the marked rows and columns to zero
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
