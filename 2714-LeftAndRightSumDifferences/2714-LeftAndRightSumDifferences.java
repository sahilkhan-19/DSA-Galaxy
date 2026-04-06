// Last updated: 4/6/2026, 2:25:06 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int[] arr = new int[n];
        for(int i : nums){
            totalSum += i;
        }
        int leftSum = 0;
        for(int i = 0 ; i < n ; i++){
            int rightSum = totalSum - leftSum - nums[i]; //bcz totalSum = leftSum + nums[i] + rightSum
            arr[i] = Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return arr;
    }
}