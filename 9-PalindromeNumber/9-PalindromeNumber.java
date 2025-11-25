// Last updated: 11/25/2025, 9:32:34 AM
class Solution {
    public boolean isPalindrome(int x) {
        int ans = x;
        int answer = 0;
        if(x<0)
        {
            return false;
        }
        if(x == 0)
        {
            return true;
        }
        while(ans > 0)
        {
            int temp = ans%10;
            answer = answer*10 + temp;
            ans = ans/10;
        }
        if(answer == x)
        {
            return true;
        }
        return false;
    }
}