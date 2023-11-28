//https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 5;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        if(k % nums.length == 0){
            return;
        }
        rotate(nums, 0, nums.length - 1);
        k %= nums.length;
        rotate(nums, 0, k - 1);
        rotate(nums, k , nums.length - 1);

    }
    public static void rotate(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}