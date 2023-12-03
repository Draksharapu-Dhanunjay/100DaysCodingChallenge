//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        for(char ch = 'a'; ch<='z'; ch++){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
//        if(sentence.length() < 26){
//            return false;
//        }
//        boolean[] ans = new boolean[26];
//        int i = 0;
//        while(i < sentence.length()){
//            int temp = sentence.charAt(i) - 'a';
//            ans[temp] = true;
//            i++;
//        }
//        for (boolean an : ans) {
//            if (!an) {
//                return false;
//            }
//        }
//        return true;
    }
}
