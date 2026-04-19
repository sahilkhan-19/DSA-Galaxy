// Last updated: 4/19/2026, 8:22:37 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        int min = Integer.MAX_VALUE;
6        for(int i = n-1 ; i >= 0 ; i--){
7            if(nums[i] < min){
8                arr[i] = nums[i];
9                min = nums[i];
10            }
11            else arr[i] = min;
12        }//[0,0,1,4]
13        int max = Integer.MIN_VALUE;
14        for(int i = 0 ; i < n ; i++){
15            if(nums[i] > max){
16                max = nums[i];
17            }
18            int check = max - arr[i];
19            if(check <= k)return i;
20        }
21        return -1;
22    }
23}