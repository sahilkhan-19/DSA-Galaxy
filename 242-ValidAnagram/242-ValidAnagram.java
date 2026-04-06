// Last updated: 4/6/2026, 2:25:36 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1 != l2) return false;
        
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1,s2);
    }
}