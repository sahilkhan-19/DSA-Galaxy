// Last updated: 2/1/2026, 8:17:33 AM
1class Solution {
2    public int countMonobit(int n) {
3        int count = 1;
4
5        long num = 1;
6        while(num <= n){
7            count++;
8            num = (num<<1) | 1;
9        }
10        return count;
11    }
12}