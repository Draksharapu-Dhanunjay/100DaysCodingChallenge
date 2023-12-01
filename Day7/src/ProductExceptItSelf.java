//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class ProductExceptItSelf {
    public static void main(String[] args) {
        int[] arr = {-12};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums){
        if(nums.length < 2){
            return nums;
        }
        int zeros = 0, temp = 1;
        for (int num : nums) {
            if (num == 0) {
                zeros++;
                continue;
            }
            temp *= num;
        }
        if(zeros >= 2){
            return new int[nums.length];
        }else if(zeros == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[i] = 0;
                }else{
                    nums[i] = temp;
                }
            }
        }else{
            for(int i = 0; i < nums.length; i++){
                nums[i] = temp/ nums[i];
            }
        }
        return nums;
    }
}
