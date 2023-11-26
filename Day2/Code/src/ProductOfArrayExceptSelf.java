//https://leetcode.com/problems/product-of-array-except-self/
import java.util.Arrays;
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int temp = 1;
        for(int num : nums){
            temp *= num;
        }
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = zeroProduct(nums, i);
                index = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && i != index){
                nums[i] = temp / nums[i];
            }
        }
        return nums;
    }
    public static int zeroProduct(int[] nums, int index){
        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            if(i == index){
                continue;
            }
            temp *= nums[i];
        }
        return temp;
    }
}
