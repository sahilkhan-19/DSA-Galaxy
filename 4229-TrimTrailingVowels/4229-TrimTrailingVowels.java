// Last updated: 4/6/2026, 2:24:37 PM
class Solution {
    public String trimTrailingVowels(String s) {
        int r = s.length() -1;
        while(r >= 0 && isVowel(s.charAt(r))){
            r--;
        }
        return s.substring(0, r+1);
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';
    }
}