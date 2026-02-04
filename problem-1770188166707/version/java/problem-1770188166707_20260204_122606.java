// Last updated: 2/4/2026, 12:26:06 PM
// Just +1 in poinets
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n = numbers.length;
4        int left = 0;
5        int right = n-1;
6        int[] arr = {-1,-1};
7        while(left<right){
8            int ans = numbers[left] + numbers[right];
9            if(ans == target){
10                arr[0] = left+1;
11                arr[1] = right+1;
12                return arr;
13            }
14            else if(ans < target) left++;
15            else right--;
16        }
17        return arr;
18    }
19}