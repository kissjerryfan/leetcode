import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            cost = Math.min(prices[i], cost);
            profit = Math.max(profit, prices[i] - cost);
        }
        return profit;
    }
}
