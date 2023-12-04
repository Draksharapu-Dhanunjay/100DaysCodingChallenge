//https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-5,-3,-2,-1};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        //Method 1
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
        int[] ans = new int[nums.length];
        int start = 0, end = nums.length - 1, i = 0;
        while (start <= end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[i] = Math.abs(nums[start] * nums[start]);
                start++;
            }else{
                ans[i] = Math.abs(nums[end] * nums[end]);
                end--;
            }
            i++;
        }
        for(int j = 0; j < ans.length/2; j++){
            int temp = ans[j];
            ans[j] = ans[ans.length - 1 - j];
            ans[ans.length - 1 - j] = temp;
        }
        return ans;
    }
}
