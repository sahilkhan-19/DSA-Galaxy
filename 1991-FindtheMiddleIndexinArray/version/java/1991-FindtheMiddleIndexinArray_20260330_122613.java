// Last updated: 3/30/2026, 12:26:13 PM
1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int total = 0;
4        
5        for(int i : nums) {
6            total += i;
7        }
8        
9        int leftSum = 0;
10        
11        for(int i = 0; i < nums.length; i++) {
12            int rightSum = total - leftSum - nums[i];
13            
14            if(leftSum == rightSum) {
15                return i;
16            }
17            
18            leftSum += nums[i];
19        }
20        
21        return -1;
22    }
23}