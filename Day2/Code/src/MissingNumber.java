//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if(nums[i] > nums.length - 1){
                i++;
            }else if(i != nums[i]){
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length ;j++){
            if(j != nums[j]){
                return j;
            }
        }
        return i;
    }
}
