// Last updated: 1/25/2026, 8:21:34 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n = nums.length;
4        for(int i = n-1; i > 0; i--){
5            if(!(nums[i]>nums[i-1])) return i;
6        }
7        return 0;
8    }
9}