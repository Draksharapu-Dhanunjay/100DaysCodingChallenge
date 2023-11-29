//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPostionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,5,5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        arr[0] = indexReturn(nums, target , true);
        arr[1] = indexReturn(nums, target, false);
        return arr;
    }
    public static int indexReturn(int[] nums, int target, boolean isFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
