// Last updated: 4/11/2026, 8:06:51 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int count = 0;
4        for(int i = 0 ; i < nums.length ; i++ ){
5            int num = nums[i];
6            while(num > 0){
7                int a = num%10;
8                if(a == digit) count++;
9                num /= 10;
10            }
11        }
12        return count;
13    }
14}