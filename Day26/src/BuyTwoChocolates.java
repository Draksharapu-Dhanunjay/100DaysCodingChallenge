//https://leetcode.com/problems/buy-two-chocolates
public class BuyTwoChocolates {
    public static void main(String[] args) {
       int[] prices = {1,2,2};
        System.out.println(buyChoco(prices, 3));
    }
    public static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price <= min) {
                secMin = min;
                min = price;
            }
            if (price > min && price < secMin) {
                secMin = price;
            }
        }
        int temp = money;
        money = money - min - secMin;
        if (money < 0) {
            return temp;
        }
        return money;
    }
}