//https://leetcode.com/problems/spiral-matrix/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixI {
    public static void main(String[] args) {
        int[][] matrix = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1, colStart = 0, colEnd = matrix[rowEnd].length - 1, dir = 0;
        while (rowStart <= rowEnd && colStart <= colEnd){
            if(dir == 0){
                for(int i = colStart; i <= colEnd; i++){
                    list.add(matrix[rowStart][i]);
                }
                rowStart++;
                dir = 1;
            } else if (dir == 1) {
                for(int i = rowStart; i <= rowEnd; i++){
                    list.add(matrix[i][colEnd]);
                }
                colEnd--;
                dir = 2;
            } else if (dir == 2) {
                for(int i = colEnd; i >= colStart; i--){
                    list.add(matrix[rowEnd][i]);
                }
                rowEnd--;
                dir = 3;
            }else{
                for(int i = rowEnd; i >= rowStart; i--){
                    list.add(matrix[i][colStart]);
                }
                colStart++;
                dir = 0;
            }
        }
        return list;
    }
}
