// Last updated: 4/6/2026, 2:24:40 PM
class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        boolean player1 = true;
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < n ; i++){
            if(nums[i] %2 != 0) player1 = !player1;
            if((i+1) % 6 == 0) player1 = !player1;
            if(player1)p1 += nums[i];
            else p2 += nums[i];
        }
        return p1-p2;
    }
}