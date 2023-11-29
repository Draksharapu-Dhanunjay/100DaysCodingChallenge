//https://leetcode.com/problems/rotate-image/description/
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        rotate(arr);
        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] i : matrix){
            reverse(i, 0, n - 1);
        }
    }
    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
