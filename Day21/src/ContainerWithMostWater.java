//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int curAmount, maxAmount = 0, i = 0, j = height.length - 1;
        while(i < j){
            if(height[i] < height[j]){
                curAmount = height[i] * (j - i);
                i++;
            }else{
                curAmount = height[j] * (j - i);
                j--;
            }
            if(curAmount > maxAmount){
                maxAmount = curAmount;
            }
        }
        return maxAmount;
    }
}
