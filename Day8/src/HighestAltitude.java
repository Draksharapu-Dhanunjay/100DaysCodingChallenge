//https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0, temp = 0;
        for(int i: gain){
            temp += i;
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}
