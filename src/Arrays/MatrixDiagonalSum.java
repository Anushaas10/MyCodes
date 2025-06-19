package Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][]  mat={
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
      int sum=0;
      for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i]; // Primary diagonal
            if (i != mat.length - 1 - i) { // Avoid double counting the center element in odd-sized matrices
                sum += mat[i][mat.length - 1 - i]; // Secondary diagonal
            }
      }
      return sum;
    }
}
