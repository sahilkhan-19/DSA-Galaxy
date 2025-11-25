// Last updated: 11/25/2025, 9:31:49 AM
class Solution {
    public int minimumFlips(int n) {
        String bint = Integer.toBinaryString(n);
        int count = 0;
        int len = bint.length();
        for(int i = 0; i < len; i++){
            if(bint.charAt(i) != bint.charAt(len - 1 -i)) count++;
        }
        return count;
    }
}