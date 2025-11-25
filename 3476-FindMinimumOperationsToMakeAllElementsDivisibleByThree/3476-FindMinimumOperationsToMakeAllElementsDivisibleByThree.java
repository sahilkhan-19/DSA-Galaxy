// Last updated: 11/25/2025, 9:31:47 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int count =0 ;
        for(int n : nums){
            if(n%3 != 0){
                count++;
            }
        }
        return count;
    }
}