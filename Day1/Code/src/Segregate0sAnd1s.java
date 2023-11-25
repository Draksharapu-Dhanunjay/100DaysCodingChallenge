//https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.Arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void segregate0and1(int[] arr, int n) {
        int start = 0, end = n - 1;
        while(start <= end){
            if(arr[start] != 1){
                start++;
            }
            if(arr[end] != 0){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }
}