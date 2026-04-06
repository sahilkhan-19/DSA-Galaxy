// Last updated: 4/6/2026, 2:25:08 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        
        for(int i : nums) {
            total += i;
        }
        
        int leftSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            
            if(leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}