// Last updated: 2/3/2026, 10:00:49 PM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        //brute
4        int mul = 1;
5        int sum = 0;
6        while(n>0){
7            int digit = n % 10; //234 - 4 
8            mul *= digit;
9            sum += digit;
10            n /= 10;
11        }
12        int ans = mul - sum;
13        return ans;
14    }
15}