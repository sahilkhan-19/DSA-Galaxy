// Last updated: 6/7/2026, 8:12:49 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int sum = 0;
4        for(int i = Math.max(1, n-k); i <= n+k ; i++){
5            if((n & i) == 0){
6                sum += i;
7            }
8        }
9        return sum;
10    }
11}