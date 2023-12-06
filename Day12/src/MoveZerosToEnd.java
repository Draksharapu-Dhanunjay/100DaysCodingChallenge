import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, -1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int i = 0, j = 0, n = arr.length;
        while (j < n){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
