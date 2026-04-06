// Last updated: 4/6/2026, 2:24:31 PM
class Solution {
    public int countCommas(int n) {
        if(n < 1000) return 0;
        return n - 999;
    }
}