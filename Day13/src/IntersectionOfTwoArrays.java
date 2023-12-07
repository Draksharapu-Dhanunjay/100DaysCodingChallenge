//https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,2,1};
        int[] arr2 = {0,2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        //Method 1
        /*
        int n = nums1.length, m = nums2.length,i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] == nums2[j]){
                if(list.size() == 0 || !(list.contains(nums1[i]))){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }else{
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            ans[k] = list.get(k);
        }
        return ans;
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0, n = nums1.length, m = nums2.length;
        int[] ans = new int[Math.min(n,m)];
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] == nums2[j]){
                if(k == 0 || ans[k - 1] != nums1[i] ){
                    ans[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }else{
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}
