// Last updated: 4/6/2026, 2:24:34 PM
class Solution {
    public long countCommas(long n) {
        long count = 0;
        long i = 1000;
        while(i <= n){
            count += (n - i + 1);
            i *= 1000;
        }
        return count;
    }
}