//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
public class MaximumProductOfTwoElementsInArray {
    public static void main(String[] args) {
        int[] arr = {3,7};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        if(nums.length < 2){
            return -1;
        }
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}
