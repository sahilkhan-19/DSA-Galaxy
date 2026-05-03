// Last updated: 5/3/2026, 8:07:32 AM
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        for(int i = 0 ; i < n ; i++){
6            int count = 0;
7            if(nums[i] % 2 == 0){
8                for(int j = i+1 ; j < n ; j++){
9                    if(nums[j] % 2 != 0) count++;
10                }
11            }
12            else{
13                for(int j = i+1; j < n ; j++){
14                    if(nums[j] % 2 == 0) count++;
15                }
16            }
17            arr[i] = count;
18        }
19        return arr;
20    }
21}