// Last updated: 3/29/2026, 8:02:39 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int n = s.length();
4        for(int i = 0 ; i < n ; i++){
5            if(s.charAt(i) == s.charAt(n-i-1)) return i;
6        }
7        return -1;
8    }
9}