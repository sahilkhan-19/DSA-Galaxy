// Last updated: 1/16/2026, 8:07:26 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor = 0;
4        for(int i : nums){
5            xor = xor ^ i;
6        }
7        return xor;
8    }
9}