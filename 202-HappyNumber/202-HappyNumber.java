// Last updated: 4/6/2026, 2:25:46 PM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = getS(slow);
            fast = getS(getS(fast));
        }while(slow != fast);
        return slow == 1; 
    }
    int getS(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            int sq = digit * digit;
            sum += sq;
            num /= 10;
        }
        return sum;
    }
}