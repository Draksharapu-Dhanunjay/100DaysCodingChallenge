//https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01
import java.util.Arrays;
public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, count = 0, n = g.length, m = s.length;
        while(i < n && j < m){
            if(g[i] <= s[j]){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}