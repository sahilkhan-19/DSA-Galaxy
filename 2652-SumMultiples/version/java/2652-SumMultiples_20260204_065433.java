// Last updated: 2/4/2026, 6:54:33 AM
// This is Brute Force.
1class Solution {
2    public int sumOfMultiples(int n) {
3        int sum = 0;
4        for(int i = n ; i > 0 ; i--){
5            if(i % 3==0 || i % 5 == 0 || i % 7 == 0) sum+=i;
6        }
7        return sum;
8    }
9}