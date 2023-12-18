//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class MaximumProductBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        if(nums.length < 4){
            return -1;
        }
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for(int i : nums){
            if(i >= max){
                secMax = max;
                max = i;
            }
            if(i < max && i > secMax){
                secMax = i;
            }
            if(i <= min){
                secMin = min;
                min = i;
            }
            if(i > min && i < secMin){
                secMin = i;
            }
        }
        return (max * secMax) - (min * secMin);
    }
}