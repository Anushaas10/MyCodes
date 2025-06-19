package Arrays;

public class OddCellsMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        int oddCount = oddCells(m, n, indices);
        System.out.println(oddCount); // Output: 6
    }

    static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int row[] = new int [m];
        int col[] = new int [n];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }
        return count;
    }
}
