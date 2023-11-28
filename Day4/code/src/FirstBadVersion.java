//https://leetcode.com/problems/first-bad-version/description/
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));
    }
    public static int firstBadVersion(int n) {
        int start = 1;
        while(start <= n){
            int mid = start+(n-start)/2;
            if(isBadVersion(mid)){
                n = mid-1;
            }
            else start = mid+1;
        }
        return start;
    }
    public static boolean isBadVersion(int n){
        boolean[] ans = {false,false,false,false,true,true,true};
        return ans[n-1];
    }
}
