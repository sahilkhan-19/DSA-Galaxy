// Last updated: 11/25/2025, 9:32:11 AM
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor = xor ^ i;
        }
        return xor;
    }
}