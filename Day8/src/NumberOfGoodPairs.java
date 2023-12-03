//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        //Method 1
        /*
        int i = 0, count = 0;
        while(i < nums.length - 1){
            int j = i + 1;
            while(j < nums.length){
                if(nums[i] == nums[j]){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
         */
        return countFinder(nums, 0);
    }
    public static int countFinder(int[] arr, int i){
        int count = 0;
        if(i == arr.length - 1){
            return 0;
        }
        int j = i + 1;
        while(j < arr.length){
            if(arr[i] == arr[j]){
                count++;
            }
            j++;
        }
        return count + countFinder(arr, i + 1);
    }
}