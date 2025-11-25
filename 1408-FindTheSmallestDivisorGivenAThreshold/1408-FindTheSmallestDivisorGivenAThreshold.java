// Last updated: 11/25/2025, 9:31:54 AM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        for(int i : nums){
            max = Math.max(max,i);
        }
        int left = 1;
        int right = max;
        while(left<=right){
            int sum = 0;
            int mid=left+(right-left)/2;

            for(int element : nums){
                sum += (element + mid-1)/mid;
            }
            if(sum > threshold) left = mid+1;
            else right = mid-1;
        }
        return left;
    }
}