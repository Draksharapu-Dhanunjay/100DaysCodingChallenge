//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
import java.util.Arrays;
public class IntersectionOfArrayII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0, n = nums1.length, m = nums2.length;
        int[] ans = new int[Math.min(n,m)];
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] == nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}
