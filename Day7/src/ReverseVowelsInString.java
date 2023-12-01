//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowelsInString {
    public static void main(String[] args) {
        String s = "LEetCode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int start = 0, end = array.length - 1;
        while (start < end){
            if((array[start] == 'a' || array[start] == 'A' )|| (array[start] == 'e' || array[start] == 'E') || (array[start] == 'i' || array[start] == 'I') || (array[start] == 'o' || array[start] == 'O') || (array[start] == 'u' || array[start] == 'U')){
                if((array[end] == 'a' || array[end] == 'A' )|| (array[end] == 'e' || array[end] == 'E') || (array[end] == 'i' || array[end] == 'I') || (array[end] == 'o' || array[end] == 'O') || (array[end] == 'u' || array[end] == 'U')){
                    char ch = array[start];
                    array[start] = array[end];
                    array[end] = ch;
                    start++;
                }
                end--;
            }else{
                start++;
            }
        }
        return new String(array);
    }
}
