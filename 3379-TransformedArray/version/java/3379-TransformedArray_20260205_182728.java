// Last updated: 2/5/2026, 6:27:28 PM
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5        for(int i = 0 ; i < n ; i++){
6           if(nums[i] == 0){
7            result[i] = nums[i];
8            continue;
9           }
10           int steps = nums[i] % n;
11           int newIndex = i + steps;
12
13           newIndex = (newIndex % n + n) % n;
14
15           result[i] = nums[newIndex];
16        }
17        return result;
18    }
19}