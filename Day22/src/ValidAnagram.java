//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        int[] arr = new int[26];
        for(int i = 0; i < n; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}