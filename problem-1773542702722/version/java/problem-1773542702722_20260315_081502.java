// Last updated: 3/15/2026, 8:15:02 AM
1class Solution {
2    public int countCommas(int n) {
3        if(n < 1000) return 0;
4        return n - 999;
5    }
6}