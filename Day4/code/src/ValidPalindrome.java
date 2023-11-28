//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "ab2a";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int start = 0, end = s.length() - 1;
        while (start < end){
            char cStart = s1.charAt(start);
            char cEnd = s1.charAt(end);
            if(('z' >= cStart && 'a' <= cStart) || (48 <= cStart && cStart <= 57)){
                if('z' >= cEnd && 'a' <= cEnd || (48 <= cEnd && cEnd <= 57)){
                    if(cStart != cEnd){
                        return false;
                    }
                    start++;
                }
                end--;
            }else{
                start++;
            }
        }
        return true;
    }
}
