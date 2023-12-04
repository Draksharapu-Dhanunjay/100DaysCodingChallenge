//https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
import java.util.*;
public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        insertionSort(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr, int size) {
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
