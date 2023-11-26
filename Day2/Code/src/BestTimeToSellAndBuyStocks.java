//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToSellAndBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int currentPrice = prices[0], maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(currentPrice < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - currentPrice);
            }else{
                currentPrice = prices[i];
            }
        }
        return maxProfit;
    }
}