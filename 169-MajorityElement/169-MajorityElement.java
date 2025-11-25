// Last updated: 11/25/2025, 9:32:08 AM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = -1;
        int n = nums.length;
        int check = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                element = nums[i];
                count++;
            }
            else if(nums[i] == element) count++;
            else count--;
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == element) check++;
        }
        if(check > Math.floor(n/2)) return element;
        else return -1;
    }
}