//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
import java.util.Arrays;
public class CanMakeAP {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = arr[1] - arr[0];
        for(int i = 1; i < n; i++){
            if(count != arr[i] - arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}
