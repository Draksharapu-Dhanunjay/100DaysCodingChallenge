//https://leetcode.com/problems/set-matrix-zeroes/
import java.util.Arrays;
public class SetMatrixToZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes(matrix);
        for(int[] i : matrix){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] mat = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(matrix[i][j] == 0){
                    mat[i][j] = 1;
                }
            }
        }
        int i = 0, j = 0;
        while (i < m){
            while (j < n){
                if(mat[i][j] == 1){
                    int k = 0;
                    while (k < n){
                        matrix[i][k] = 0;
                        k++;
                    }
                    k = 0;
                    while (k < m){
                        matrix[k][j] = 0;
                        k++;
                    }
                }
                j++;
            }
            i++;
            j = 0;
        }
    }
}
