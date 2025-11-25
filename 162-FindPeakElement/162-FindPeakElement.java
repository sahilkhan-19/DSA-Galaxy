// Last updated: 11/25/2025, 9:32:10 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int peak = Integer.MIN_VALUE;
        if(n==1) return 0;
        else if (nums[0] > nums[1]) return 0;
        else if (nums[n-1] > nums[n-2]) return n-1;
        else {
            int p = 1;
            int q = n-2;
            while(p<=q){
                int mid = (p+q)/2;

                if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                    return mid;
                }
                //Peak at right
                else if(nums[mid] > nums[mid-1]){
                    p = mid + 1;
                }
                //Peak at left
                else{
                    q = mid - 1;
                }
            }
        }
        return -1;
    }
}