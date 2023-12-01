//https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSequence {
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int big : nums) {
            if(big <= small) {
                small = big;
            }
            else if(big <= mid) {
                mid = big;
            }
            else return true;
        }
        return false;
    }
}
