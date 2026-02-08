// Last updated: 2/8/2026, 8:20:09 AM
1class Solution {
2    public int dominantIndices(int[] nums) {
3       int n = nums.length;
4        int count = 0;
5        int sum = 0;
6        for(int i = n-1; i > 0 ; i--){
7            sum += nums[i];
8            int avg = sum/(n-i);
9            if(nums[i-1] > avg) count++;
10        }
11        return count;
12    }
13}