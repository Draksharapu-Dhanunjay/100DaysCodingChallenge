public class LargestSubStringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int i = 0,n = s.length(), j = n - 1;
        int len = -1;
        while (2 * i < n){
            if(s.charAt(i) == s.charAt(j)){
                len = Math.max(len, j - i - 1);
            }
            j--;
            if(j == i){
                i++;
                j = n - 1;
            }
        }
        return len;
    }
}