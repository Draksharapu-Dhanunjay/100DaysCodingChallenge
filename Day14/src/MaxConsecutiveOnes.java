//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int curConsecutive = 0, maxConsecutive = 0;
        for(int i : nums){
            if(i == 1){
                curConsecutive++;
            }
            if(curConsecutive > maxConsecutive){
                maxConsecutive = curConsecutive;
            }
            if(i != 1){
                curConsecutive = 0;
            }
        }
        return maxConsecutive;
    }
}