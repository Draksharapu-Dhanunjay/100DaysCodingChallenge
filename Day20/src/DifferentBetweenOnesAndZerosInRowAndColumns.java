//https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
import java.util.Arrays;
public class DifferentBetweenOnesAndZerosInRowAndColumns {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1}, {1,1,1}};
        int[][] ans = onesMinusZeros(grid);
        for(int[] row: ans){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        int k = 0;
        for (int[] value : grid) {
            for (int col = 0; col < n; col++) {
                if (value[col] == 1) {
                    onesRow[k]++;
                }
            }

            k++;
        }
        k = 0;
        for(int col = 0; col < n; col++){
            for (int[] ints : grid) {
                if (ints[col] == 1) {
                    onesCol[k]++;
                }
            }
            k++;
        }
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                ans[row][col] = 2 * onesRow[row] + 2 * onesCol[col] - n - m;
            }
        }
        return ans;
    }
}