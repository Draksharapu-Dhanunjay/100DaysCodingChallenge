//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i: nums){
            ans ^= i;
        }
        return ans;
    }
}
