// Last updated: 2/4/2026, 4:59:33 PM
// Brute
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        for(int i = 0 ; i < n ; i++){
6            //left sum
7            int left = 0;
8            int right = 0;
9            for(int j = 0; j < i; j++){
10                left += nums[j];
11            }
12            //right sum
13            for(int k = i+1; k < n ; k++){
14                right += nums[k];
15            }
16            arr[i] = Math.abs(left-right);
17        }
18        return arr;
19    }
20}