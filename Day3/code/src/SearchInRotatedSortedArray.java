//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 3;
        System.out.println(search(arr, target));
    }
    public static int search(int[] nums, int target) {
        int pivot = pivotFind(nums);
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[nums.length - 1] >= target){
            return binarySearch(nums, target, pivot, nums.length - 1);
        }
        return binarySearch(nums, target,0 , pivot - 1);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int pivotFind(int[] nums){
        int start = 0, end = nums.length - 1;
        while (start < end){
            if(nums[start] > nums[end]){
                end--;
            }else{
                break;
            }
        }
        return ( end + 1 )% nums.length;
    }
}
