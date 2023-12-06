//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
public class CalculateMoneyInLeetCodeBank {
    public static void main(String[] args) {
        System.out.println(totalMoney(26));
    }
    public static int totalMoney(int n) {
        int week = n / 7;
        int day = n % 7;
        int weeklyExtra = (week * (week - 1)) * 7/2;
        int daysAmount = ((week + day)* (week + day + 1)/2) - (week * (week + 1))/2;
        int total = week * 28 + weeklyExtra + daysAmount;
        return total;
    }
}
