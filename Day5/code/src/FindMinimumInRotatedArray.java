//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1108929516/
public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = (end - start)/2 + start;
            if (nums[end] > nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
