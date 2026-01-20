// Last updated: 1/20/2026, 8:16:23 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxi = Integer.MIN_VALUE;
4        int sum = 0;
5        for(int i = 0 ; i < nums.length ; i++){
6            sum += nums[i];
7            maxi = Math.max(sum,maxi);
8            if(sum < 0) sum = 0;
9        }
10        return maxi;
11    }
12}