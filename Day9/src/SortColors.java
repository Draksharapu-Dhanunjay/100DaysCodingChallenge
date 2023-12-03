//https://leetcode.com/problems/sort-colors/
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;
        while (start <= mid && mid <= end){
            if(nums[mid] == 0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                mid++;
                start++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }
        }
    }
}
