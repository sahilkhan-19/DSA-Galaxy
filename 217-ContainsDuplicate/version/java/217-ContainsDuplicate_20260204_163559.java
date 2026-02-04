// Last updated: 2/4/2026, 4:35:59 PM
/*
 * Pure Math, Just remember the formula: 
 * No. of trailing 0's in x! = (x/5) + (x/5^2) + (x/5^3) + ....
*/

1class Solution {
2    public int trailingZeroes(int n) {
3        int res = 0;
4        for(int i = 5; i <= n; i*=5){
5            res = res + n/i;
6        }
7        return res;
8    }
9}