// Last updated: 3/1/2026, 8:18:11 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int r = s.length() -1;
4        while(r >= 0 && isVowel(s.charAt(r))){
5            r--;
6        }
7        return s.substring(0, r+1);
8    }
9    private boolean isVowel(char c){
10        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';
11    }
12}