// Last updated: 1/31/2026, 8:50:48 PM
1class Solution {
2    public int minimumK(int[] nums) {
3        int left = 1;
4        int right = 100000;
5        int result = right;
6        while(left<=right){
7            int mid = left + (right-left) / 2;
8            if((long)nonPositive(nums,mid) <= (long) mid*mid){
9                result = mid;
10                right = mid-1;
11            }else left = mid+1;
12        }
13        return result;
14    }
15    static int nonPositive(int[] nums, int k){
16        int operations = 0;
17        for(int i : nums){
18            operations += (int) Math.ceil((double)i/k);
19        }
20        return operations;
21    }
22}