// Last updated: 11/25/2025, 9:31:48 AM
class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        long ans = 0;

        while(n>0){
            int digit = n%10;
            if(digit!=0){
                ans = digit + ans*10;
                sum+=digit;
            }
            n/=10;
        }

        long result = 0;
        while(ans>0){
            result = result * 10 + (ans%10);
            ans /= 10;
        }
        return result * sum;
    }
}