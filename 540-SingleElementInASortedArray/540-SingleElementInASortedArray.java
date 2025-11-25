// Last updated: 11/25/2025, 9:32:01 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        else if (nums[0] != nums[1]) return nums[0];
        else if(nums[n-1] != nums[n-2]) return nums[n-1];
        else{
            int p = 0;
            int q = n-2;
            while(p<=q){
                int mid = (p+q)/2;

                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];

                else if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0  && nums[mid] == nums[mid+1])){
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