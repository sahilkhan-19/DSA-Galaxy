// Last updated: 11/25/2025, 9:31:50 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int p = 0;
        int q = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                arr[p] = nums[i];
                p+=2;
            }
            else{
                arr[q] = nums[i];
                q+=2;
            }
        }
        return arr;
    }
}