// Last updated: 11/25/2025, 9:32:13 AM
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i = 1; i < n; i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        if(profit<0) return 0;
        return profit;
    }
}