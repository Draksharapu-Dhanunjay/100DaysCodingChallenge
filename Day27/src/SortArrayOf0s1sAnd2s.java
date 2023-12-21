import java.util.ArrayList;
import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977
public class SortArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 0, 0, 1, 0));
        sortArray(list,8);
        System.out.println(list);
    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid , temp);
                mid++;
                low++;
            }else if(arr.get(mid) == 1){
                mid++;
            }else{
                int temp = arr.get(high);
                arr.set(high, arr.get(mid));
                arr.set(mid, temp);
                high--;
            }
        }
    }
}
