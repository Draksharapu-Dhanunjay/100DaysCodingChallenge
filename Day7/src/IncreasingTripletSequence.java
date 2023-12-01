//https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSequence {
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        int j = 1;
        while (j < nums.length - 1){
            int i = j - 1;
            if(nums[i] < nums[j]){
                int k = j + 1;
                while (j < nums.length){
                    if(nums[j] < nums[k]){
                        return true;
                    }
                    k++;
                    if(k == nums.length - 1){
                        j++;
                    }
                }
            }
            i--;
            if(i < 0){
                j++;
            }
        }
        return false;

    }
}
