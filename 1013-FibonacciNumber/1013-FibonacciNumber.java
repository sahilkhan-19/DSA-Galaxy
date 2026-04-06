// Last updated: 4/6/2026, 2:25:23 PM
class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}