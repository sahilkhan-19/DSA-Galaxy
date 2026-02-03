// Last updated: 2/3/2026, 10:06:42 PM
class Solution {
    public int finalElement(int[] nums) {
        int n = nums.length;
        return Math.max(nums[0],nums[n-1]);
    }
}