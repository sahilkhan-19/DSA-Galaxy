// Last updated: 11/25/2025, 9:32:29 AM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int p = 0;
        int q = n-1;
        while(p<=q){
            int mid = (p+q)/2;
            if(nums[mid]==target) return mid;

            //Left Sorted
            if(nums[mid] >= nums[p]){
                if(target >= nums[p] && target <= nums[mid]){
                    q = mid -1;
                }
                else{
                    p = mid + 1;
                }
            }
            //Right Sorted
            else{
                if(target >= nums[mid] && target <= nums[q]){
                    p = mid + 1;
                }
                else{
                    q = mid - 1;
                }
            }
        }
        return -1;
    }
}