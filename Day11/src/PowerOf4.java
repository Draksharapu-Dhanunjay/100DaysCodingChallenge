//https://leetcode.com/problems/power-of-four/description/
public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
    public static boolean isPowerOfFour(int n) {
        if(n < 4){
            return n == 1;
        }
        if(n % 4 == 0){
            return isPowerOfFour(n /4);
        }
        return false;
    }
}
