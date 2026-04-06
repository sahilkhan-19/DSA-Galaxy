// Last updated: 4/6/2026, 2:25:22 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
     int n = nums.length;
     int l = 0;
     int r = n-1;
     int[] arr = new int[n];
     int i=1;
     while(l<=r){
        int a = nums[l] * nums[l];
        int b = nums[r] * nums[r];
        if(a>b){
            arr[n-i] = a;
            l++;
            i++;
        }
        else{
            arr[n-i] = b;
            r--;
            i++;
        }
     }
     return arr;

    }
}