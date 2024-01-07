import java.util.Arrays;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[] {3, 1, -2, -5, 2, -4})));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length, index1 = 0, index2 = 1;
        int[] ans = new int[n];
        for (int num : nums) {
            if (num >= 0) {
                ans[index1] = num;
                index1 += 2;
            } else {
                ans[index2] = num;
                index2 += 2;
            }
        }
        return ans;
    }
}
