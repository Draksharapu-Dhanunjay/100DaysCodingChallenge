public class RedistributeCharactersToMakeAllStringsEqual {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        int count = 0, n = words.length;
        if(n == 1){
            return true;
        }
        for (String word : words) {
            count += word.length();
        }
        if(count % n != 0){
            return false;
        }
        int[] charArray = new int[26];
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                charArray[word.charAt(j) - 'a']++;
            }
        }
        for(int i : charArray){
            if (i % n != 0) {
                return false;
            }
        }
        return true;
    }
}