//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399
//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505
import java.util.HashMap;
class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1, len = 0, sum = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k){
                len = Math.max(len, i + 1);
            }
            if(hash.containsKey(sum - k)){
                len = Math.max(i - hash.get(sum - k), len);
            }
            if(!hash.containsKey(sum)){
                hash.put(sum, i);
            }
        }
        System.out.println(len);
    }
}