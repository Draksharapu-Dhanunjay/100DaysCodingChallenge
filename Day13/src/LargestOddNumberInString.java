//https://leetcode.com/problems/largest-odd-number-in-string/description/
public class LargestOddNumberInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
    public static String largestOddNumber(String num) {
        char[] ch = num.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            if(ch[i] % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
//        char[] ch=num.toCharArray();
//        int i;
//        for(i=ch.length-1; i>=0; i--){
//            if((ch[i]-'0') % 2==1)
//                break;
//        }
//        if(i == -1)
//            return "";
//        return num.substring(0, i+1);
    }
}
