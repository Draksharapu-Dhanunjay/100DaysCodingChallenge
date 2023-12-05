//https://leetcode.com/problems/power-of-two/
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(9));
    }
    public static boolean isPowerOfTwo(int n) {
//        Method 1 Using bitwise operators
//        return (n >0 && (n&(n-1))==0);
        if(n <= 1){
            return n == 1;
        }
        if(n % 2 == 0){
            return isPowerOfTwo(n / 2);
        }
        return false;
    }
}