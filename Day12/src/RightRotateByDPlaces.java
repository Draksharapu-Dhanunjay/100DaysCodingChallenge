import java.util.Arrays;
public class RightRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 20);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, 0, n - 1);
    }
    static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
