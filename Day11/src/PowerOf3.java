//https://leetcode.com/problems/power-of-three/
public class PowerOf3 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }
    public static boolean isPowerOfThree(int n) {
        if(n <= 1){
            return n == 1;
        }
        if(n % 3 == 0){
            return isPowerOfThree(n / 3);
        }
        return false;
    }
}
