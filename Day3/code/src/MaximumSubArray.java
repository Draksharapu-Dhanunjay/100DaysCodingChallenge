//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i : nums){
            curSum += i;
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}