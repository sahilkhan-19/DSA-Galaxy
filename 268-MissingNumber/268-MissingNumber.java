// Last updated: 11/25/2025, 9:32:04 AM
class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor2 = xor2 ^ nums[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }

        return (xor1 ^ xor2); // the missing number
    }
}