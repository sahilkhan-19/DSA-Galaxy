// Last updated: 3/15/2026, 8:23:27 AM
1class Solution {
2    public long countCommas(long n) {
3        long count = 0;
4        long i = 1000;
5        while(i <= n){
6            count += (n - i + 1);
7            i *= 1000;
8        }
9        return count;
10    }
11}