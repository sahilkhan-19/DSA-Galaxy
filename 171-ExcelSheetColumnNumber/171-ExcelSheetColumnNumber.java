// Last updated: 4/6/2026, 2:25:50 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        char[] arr = columnTitle.toCharArray();
        int n = arr.length;
        for(int i = n-1 ; i >= 0 ; i--){
            int value = arr[i] - 'A' + 1;
            sum += value * (Math.pow(26,(n-i-1)));
        }
        return sum;
    }
}