//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=list&envId=om0hrhyt
import java.util.Arrays;
public class FindNUUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }
    public static int[] sumZero(int n) {
        if(n == 1){
            return new int[] {0};
        }
        int start = 0, end = n - 1, value = -1;
        int[] arr = new int[n];
        while(start < end){
            arr[start] = value;
            arr[end] = Math.abs(arr[start]);
            value--;
            start++;
            end--;
        }
        return arr;
    }
}