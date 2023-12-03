//https://leetcode.com/problems/spiral-matrix-ii/description/
import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(2);
        for(int[] i : ans){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1 , dir = 0, count = 1;
        while (rowStart <= rowEnd && colStart <= colEnd){
            if(dir == 0){
                for(int i = colStart; i <= colEnd; i++){
                    matrix[rowStart][i] = count;
                    count++;
                }
                rowStart++;
                dir = 1;
            }else if(dir == 1){
                for(int i = rowStart; i <= rowEnd; i++){
                    matrix[i][colEnd] = count;
                    count++;
                }
                colEnd--;
                dir = 2;
            }else if(dir == 2){
                for(int i = colEnd; i >= colStart; i--){
                    matrix[rowEnd][i] = count;
                    count++;
                }
                rowEnd--;
                dir = 3;
            }else{
                for(int i = rowEnd; i >= rowStart; i--){
                    matrix[i][colStart] = count;
                    count++;
                }
                colStart++;
                dir = 0;
            }
        }
        return matrix;
    }
}
