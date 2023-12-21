//https://www.codingninjas.com/studio/problems/reading_6845742
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] book = {4,1,2,3,1};
        System.out.println(read(5, book, 5));
    }
    public static String read(int n, int []book, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            int value = target - book[i];
            if(hash.containsKey(value)){
                return "YES";
            }
            hash.put(book[i], i);
        }
        return "NO";
    }
}