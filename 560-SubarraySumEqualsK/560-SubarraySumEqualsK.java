// Last updated: 4/6/2026, 2:25:29 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ;
            for(int j = i; j < n ; j++){
                sum += nums[j];
                if(sum == k)count++;
            }
        }
        return count;
    }
}