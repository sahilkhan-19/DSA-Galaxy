// Last updated: 2/5/2026, 10:02:27 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3     int n = nums.length;
4     int l = 0;
5     int r = n-1;
6     int[] arr = new int[n];
7     int i=1;
8     while(l<=r){
9        int a = nums[l] * nums[l];
10        int b = nums[r] * nums[r];
11        if(a>b){
12            arr[n-i] = a;
13            l++;
14            i++;
15        }
16        else{
17            arr[n-i] = b;
18            r--;
19            i++;
20        }
21     }
22     return arr;
23
24    }
25}