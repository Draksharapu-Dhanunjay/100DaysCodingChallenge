//https://www.codingninjas.com/studio/problems/quick-sort_5844?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {0,2,-2,342,6,-5,94};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] input,int startIndex, int endIndex) {
        if(startIndex < endIndex){
            int pIndex = Index(input, startIndex, endIndex);
            quickSort(input, startIndex, pIndex - 1);
            quickSort(input, pIndex + 1, endIndex);
        }
    }
    public static int Index(int[] arr, int start, int end){
        int i = start, j = end , pivot = arr[start];
        while(i < j){
            while(pivot >= arr[i] && i <= end - 1){
                i++;
            }
            while(pivot < arr[j] && j >= start + 1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;
        return j;
    }
}
