//https://leetcode.com/problems/find-words-containing-character/description/
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        System.out.println(findWordsContaining(words, 'm'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            int j = 0;
            while (j < words[i].length()){
                if(words[i].charAt(j) == x){
                    list.add(i);
                    break;
                }
                j++;
            }
        }
        return list;
    }
}