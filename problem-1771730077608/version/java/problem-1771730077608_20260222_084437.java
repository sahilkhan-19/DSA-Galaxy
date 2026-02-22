// Last updated: 2/22/2026, 8:44:37 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int n = nums.length;
4        boolean player1 = true;
5        int p1 = 0;
6        int p2 = 0;
7        for(int i = 0; i < n ; i++){
8            if(nums[i] %2 != 0) player1 = !player1;
9            if((i+1) % 6 == 0) player1 = !player1;
10            if(player1)p1 += nums[i];
11            else p2 += nums[i];
12        }
13        return p1-p2;
14    }
15}