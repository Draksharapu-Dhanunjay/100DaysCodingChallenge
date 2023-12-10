//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class FindAllNumbersDisapperaedInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == i + 1){
                i++;
            }else if(nums[i] > n){
                i++;
            } else{
                if(nums[i] != nums[nums[i] - 1]){
                    int temp = nums[i];
                    nums[i] = nums[nums[i] - 1];
                    nums[temp - 1] = temp;
                }else{
                    i++;
                }
            }
        }
        for(int j = 0; j < n; j++){
            if(nums[j] != j + 1){
                list.add(j + 1);
            }
        }
        return list;
    }
}
