//https://leetcode.com/problems/plus-one/description/
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] + 1!= 10){
            digits[digits.length -1] = digits[digits.length -1] + 1;
            return digits;
        }
        int i = digits.length - 1, count = 1;
        while (i >= 0){
            if(digits[i] == 9){
                count++;
            }else{
                break;
            }
            i--;
        }
        if(i < 0){
            i = 0;
        }
        if(count + i == digits.length){
            digits[i] = digits[i] + 1;
            for(int j = digits.length - 1; j > i; j--){
                digits[j] = 0;
            }
            return digits;
        }
        int[] ans = new int[digits.length + 1];
        ans[i] = 1;
        return ans;
        //Method 2
//        int N = digits.length;
//        for(int i=N-1;i>=0;i--){
//            if(digits[i]==9) digits[i]=0;
//            else{
//                digits[i]+=1;
//                return digits;
//            }
//        }
//        digits = new int[N+1];
//        digits[0]= 1;
//        return digits;
    }
}
