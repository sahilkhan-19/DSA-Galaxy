// Last updated: 11/25/2025, 9:32:09 AM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int p = 0;
        int q = n-1;
        int ans = Integer.MAX_VALUE;

        while(p<=q){
            int mid = (p+q)/2;

            if(nums[p] <= nums[q]){
                ans = Math.min(ans,nums[p]);
                break;
            }

            if(nums[p] <= nums[mid]){
                ans  = Math.min(ans,nums[p]);
                p = mid + 1;
            }else{
                ans = Math.min(ans,nums[mid]);
                q = mid - 1;
            }
        }
        return ans;
    }
}