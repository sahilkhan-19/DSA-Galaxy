// Last updated: 1/20/2026, 9:05:09 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit = 0;
4        int mini = Integer.MAX_VALUE;
5        for(int i : prices){
6            if(i < mini) mini = i;
7            else profit = Math.max(profit, i - mini);
8        }
9        return profit;
10    }
11}