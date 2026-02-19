// Last updated: 2/19/2026, 10:39:11 AM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        do{
6            slow = getS(slow);
7            fast = getS(getS(fast));
8        }while(slow != fast);
9        return slow == 1; 
10    }
11    int getS(int num){
12        int sum = 0;
13        while(num > 0){
14            int digit = num % 10;
15            int sq = digit * digit;
16            sum += sq;
17            num /= 10;
18        }
19        return sum;
20    }
21}