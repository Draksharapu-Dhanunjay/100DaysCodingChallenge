//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
public class SpecialArrayWithXElements {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        if(nums.length < 1){
            return -1;
        }
        int n = 1;
        return check(nums, n);
    }
    public static int check(int[] arr, int n){
        if(n > arr.length){
            return -1;
        }
        int count = 0;
        for (int j : arr) {
            if (n <= j) {
                count++;
            }
        }
        if(count == n){
            return count;
        }
        return check(arr, n + 1);
    }
}
