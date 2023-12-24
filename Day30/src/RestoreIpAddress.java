import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }
    static void  backtrack(String s, int index, List<Integer> curr, List<String> res) {
        if(index == s.length()) {
            StringBuffer sb = new StringBuffer();
            if(curr.size() == 4) {
                for(int i = 0; i < curr.size(); i ++) {
                    sb.append("" + curr.get(i));
                    if(i < curr.size() - 1) {
                        sb.append('.');
                    }
                }
                res.add(sb.toString());
            }
            return;
        }
        int curDigit = s.charAt(index) - '0';
        curr.add(curDigit); //1,0
        backtrack(s, index + 1, curr, res);
        curr.remove(curr.size()- 1);

        if(curr.size() > 0) {
            int last = curr.get(curr.size() - 1);
            int candidate = last * 10 + curDigit;
            if (last != 0 && candidate <=255) {
                curr.remove(curr.size() -1);
                curr.add(candidate);
                backtrack(s, index+1, curr, res);
            }
        }
    }
}
