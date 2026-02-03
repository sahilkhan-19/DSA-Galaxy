// Last updated: 2/3/2026, 10:06:48 PM
class Solution {
    public int subtractProductAndSum(int n) {
        //brute
        int mul = 1;
        int sum = 0;
        while(n>0){
            int digit = n % 10; //234 - 4 
            mul *= digit;
            sum += digit;
            n /= 10;
        }
        int ans = mul - sum;
        return ans;
    }
}