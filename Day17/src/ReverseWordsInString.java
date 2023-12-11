public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("   the sky is  blue   "));
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
