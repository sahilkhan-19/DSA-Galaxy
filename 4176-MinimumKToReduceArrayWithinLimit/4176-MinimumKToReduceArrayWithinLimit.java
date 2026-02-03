// Last updated: 2/3/2026, 10:06:39 PM
class Solution {
    public int minimumK(int[] nums) {
        int left = 1;
        int right = 100000;
        int result = right;
        while(left<=right){
            int mid = left + (right-left) / 2;
            if((long)nonPositive(nums,mid) <= (long) mid*mid){
                result = mid;
                right = mid-1;
            }else left = mid+1;
        }
        return result;
    }
    static int nonPositive(int[] nums, int k){
        int operations = 0;
        for(int i : nums){
            operations += (int) Math.ceil((double)i/k);
        }
        return operations;
    }
}