//https://leetcode.com/problems/reverse-string/
import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int n = s.length - 1;
        for(int i = 0; i <= n/2; i++){
            char temp = s[i];
            s[i] = s[n - i];
            s[n- i] = temp;
        }
    }
}
