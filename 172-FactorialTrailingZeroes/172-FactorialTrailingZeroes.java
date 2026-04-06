// Last updated: 4/6/2026, 2:25:49 PM
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        for(int i = 5; i <= n; i*=5){
            res = res + n/i;
        }
        return res;
    }
}