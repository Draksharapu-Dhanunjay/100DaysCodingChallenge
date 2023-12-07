//https://www.codingninjas.com/studio/problems/intersection-of-2-arrays_1082149?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
import java.util.*;
public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 2));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(findArrayIntersection(arr1, arr1.size(), arr2, arr2.size()));
    }
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m){
            int a = arr1.get(i), b = arr2.get(j);
            if(a < b){
                i++;
            }else if(a == b){
                ans.add(a);
                i++;
                j++;
            }else{
                j++;
            }
        }
        return ans;
    }
}