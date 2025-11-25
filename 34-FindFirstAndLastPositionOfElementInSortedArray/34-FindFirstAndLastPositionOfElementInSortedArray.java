// Last updated: 11/25/2025, 9:32:28 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};

        int p = 0, q = n - 1;
        while (p <= q) {
            int mid = (p + q) / 2;
            if (nums[mid] >= target) {
                q = mid - 1;
            } else {
                p = mid + 1;
            }
        }
        if (p < n && nums[p] == target) {
            ans[0] = p;
        } else {
            return ans; 
        }

        p = 0; q = n - 1;
        while (p <= q) {
            int mid = (p + q) / 2;
            if (nums[mid] <= target) {
                p = mid + 1;
            } else {
                q = mid - 1;
            }
        }
        ans[1] = q;

        return ans;
    }
}
