//https://www.codingninjas.com/studio/problems/majority-element_6783241
import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int []v) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = v.length;
        for (int k : v) {
            if (hash.containsKey(k)) {
                int temp = hash.get(k);
                temp++;
                hash.put(k, temp);
            }else{
            hash.put(k, 1);
            }
        }
        for(HashMap.Entry<Integer, Integer> it: hash.entrySet()){
            if(it.getValue() > n /2){
                return it.getKey();
            }
        }
        return -1;
    }
}