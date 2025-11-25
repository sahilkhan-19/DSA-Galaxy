// Last updated: 11/25/2025, 9:32:02 AM
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int num : nums){
            if(num == 1){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}