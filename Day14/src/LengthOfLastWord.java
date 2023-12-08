//https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("d"));
    }
    public static int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1, count = 0;
        for(int i = lastIndex; i >= 0; i--){
            if(Character.isWhitespace(s.charAt(lastIndex))){
                lastIndex--;
            }else {
                break;
            }
        }
        while (lastIndex >= 0){
            if(Character.isWhitespace(s.charAt(lastIndex))){
                return count;
            }
            count++;
            lastIndex--;
        }
        return count;
    }
}
