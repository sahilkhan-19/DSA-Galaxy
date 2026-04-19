// Last updated: 4/19/2026, 8:12:02 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3         int max = Integer.MIN_VALUE;
4        for(int i = 0 ; i < nums.length ; i++){
5            int min = Integer.MAX_VALUE;
6            if(nums[i] > max) max = nums[i];
7            for(int j = nums.length-1 ; j >= i ; j--){
8                if(nums[j] < min) min = nums[j];
9            }
10            int ans = max - min;
11            if(ans <= k) return i;
12        }
13        return -1;
14    }
15}