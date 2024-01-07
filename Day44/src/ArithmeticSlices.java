public class ArithmeticSlices {
    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(new int[] {1,2,3,4}));
    }
    public static int numberOfArithmeticSlices(int[] nums) {
//        int[] dp = new int[nums.length];
        int res = 0 , dp = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                dp = 1 + dp;
                res += dp;
            }else{
                dp = 0;
            }
        }
        return res;
    }
}