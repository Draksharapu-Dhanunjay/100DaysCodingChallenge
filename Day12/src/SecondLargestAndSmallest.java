
import java.util.Arrays;
public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4,0,6};
        System.out.println(Arrays.toString(getSecondOrderElements(6, arr)));
    }
    public static int[] getSecondOrderElements(int n, int []arr) {
        if(n < 2){
            return new int[] {-1, -1};
        }
        int[] ans = {-1, -1};
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                ans[0] = largest;
                largest = arr[i];
            }else if(arr[i] > ans[0] && arr[i] < largest){
                ans[0] = arr[i];
            }
            if(arr[i] < smallest){
                ans[1] = smallest;
                smallest = arr[i];
            }else if(arr[i] < ans[1] && arr[i] > smallest){
                ans[1] = arr[i];
            }
        }

        return ans;
    }
}