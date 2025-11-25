// Last updated: 11/25/2025, 9:32:26 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int p = 0;
        int q = n-1;
        int ans = n;

        while(p <= q){
            int mid = (p+q)/2;
            if(nums[mid] >= target){
                ans = mid;
                q = mid - 1;
            }  
            else p = mid + 1;
        }
        return ans;
    }
}