package Arrays;
import java.util.Arrays;
public class MatrixInDistanceOrder {
    public static void main(String[] args) {
        int[][] ans= allCellsDistOrder(2, 3, 1, 2);
    }
    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][];
        int resultIdx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[resultIdx++] = new int[] { r, c };
            }
        }
        Arrays.sort(result, (a, b) -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter) -
                Math.abs(b[0] - rCenter) - Math.abs(b[1] - cCenter));
        return result;
    }
}
