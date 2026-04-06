// Last updated: 4/6/2026, 2:24:49 PM
class Solution {
    public int dominantIndices(int[] nums) {
       int n = nums.length;
        int count = 0;
        int sum = 0;
        for(int i = n-1; i > 0 ; i--){
            sum += nums[i];
            int avg = sum/(n-i);
            if(nums[i-1] > avg) count++;
        }
        return count;
    }
}