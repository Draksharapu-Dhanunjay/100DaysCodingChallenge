import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12}));
    }
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int t = entry.getValue();
            if (t == 1)
                return -1;
            count += t / 3;
            if (t % 3 != 0)
                count++;
        }
        return count;
    }
}