// Last updated: 2/22/2026, 1:45:33 PM
1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        int a = 0;
5        int b = 1;
6        for(int i = 2 ; i <= n ; i++){
7            int c = a + b;
8            a = b;
9            b = c;
10        }
11        return b;
12    }
13}