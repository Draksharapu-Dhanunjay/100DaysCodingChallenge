//https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerBed = {0};
        System.out.println(canPlaceFlowers(flowerBed, 0));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, m = flowerbed.length - 1;
        if(m == 0){
            if(flowerbed[m] == 0){
                n--;
            }
            if(n < 0){
                n = 0;
            }
            return n == 0;
        }
        if(flowerbed[i] == 0 && flowerbed[i + 1] != 1) {
            flowerbed[i] = 1;
            n--;
        }
        i++;
        while(i < m - 1){
            if(flowerbed[i] == 0){
                if(flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }
        if(flowerbed[m] != 1 && flowerbed[m - 1] != 1){
            flowerbed[m] = 1;
            n--;
        }
        if(n < 0){
            n = 0;
        }
        return n == 0;
    }
}