//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
import java.lang.StringBuilder;
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s: word1){
            sb1.append(s);
        }
        for(String s: word2){
            sb2.append(s);
        }
//        if(sb1.length() != sb2.length()){
//            return false;
//        }
//        for(int i = 0; i < sb1.length(); i++){
//            if (sb1.charAt(i) != sb2.charAt(i)) {
//                return false;
//            }
//        }
//        return true;
        return sb1.toString().equals(sb2.toString());
    }
}
