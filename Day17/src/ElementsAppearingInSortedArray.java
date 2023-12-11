//https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description
public class ElementsAppearingInSortedArray {
    public static void main(String[] args) {
        int[] arr = {15,15,21,21,32,32,33,33,33,34,35};
        System.out.println(findSpecialInteger(arr));
    }
    public static int findSpecialInteger(int[] arr) {
        int i = 0, temp = arr[0], n = arr.length;
        int curCount = 0, maxCount = 0, index = 0;
        while (i < n){
            if(temp != arr[i]){
                temp = arr[i];
                curCount = 0;
            }
            curCount++;
            if(curCount > maxCount){
                maxCount = curCount;
                index = i;
            }
            i++;
        }
        return arr[index];
    }
}