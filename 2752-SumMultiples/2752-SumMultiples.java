// Last updated: 4/6/2026, 2:25:05 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = n ; i > 0 ; i--){
            if(i % 3==0 || i % 5 == 0 || i % 7 == 0) sum+=i;
        }
        return sum;
    }
}