// Last updated: 4/6/2026, 2:25:52 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int[] arr = {-1,-1};
        while(left<right){
            int ans = numbers[left] + numbers[right];
            if(ans == target){
                arr[0] = left+1;
                arr[1] = right+1;
                return arr;
            }
            else if(ans < target) left++;
            else right--;
        }
        return arr;
    }
}