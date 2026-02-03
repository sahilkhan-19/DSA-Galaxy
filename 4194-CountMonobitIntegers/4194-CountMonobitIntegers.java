// Last updated: 2/3/2026, 10:06:36 PM
class Solution {
    public int countMonobit(int n) {
        int count = 1;

        long num = 1;
        while(num <= n){
            count++;
            num = (num<<1) | 1;
        }
        return count;
    }
}