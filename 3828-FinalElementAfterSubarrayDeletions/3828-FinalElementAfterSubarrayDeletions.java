// Last updated: 2/2/2026, 9:21:44 PM
1class Solution {
2    public int finalElement(int[] nums) {
3        int n = nums.length;
4        return Math.max(nums[0],nums[n-1]);
5    }
6}