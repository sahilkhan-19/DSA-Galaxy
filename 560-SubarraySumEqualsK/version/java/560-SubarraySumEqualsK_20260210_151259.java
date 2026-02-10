// Last updated: 2/10/2026, 3:12:59 PM
// Brute - to count subarray sum.
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0;
5        for(int i = 0 ; i < n ; i++){
6            int sum = 0 ;
7            for(int j = i; j < n ; j++){
8                sum += nums[j];
9                if(sum == k)count++;
10            }
11        }
12        return count;
13    }
14}