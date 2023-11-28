//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        /* Binary Search without Recursion
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
       return start;
         */
        //Binary Search using Binary Search
        return search(nums, target, 0, nums.length - 1);
    }
    public static int search(int[] nums, int target, int start, int end){
        if(start > end){
            return start;
        }
        int mid = (end - start)/2 + start;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target) {
            return search(nums, target, mid + 1, end);
        }
        return search(nums, target, start, mid - 1);
    }
}
