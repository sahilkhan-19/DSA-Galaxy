// Last updated: 2/4/2026, 5:20:29 PM
/*
 * Used Prefix Sum -> first calculated Total sum of array then took 2 variables leftSum and rightSum.
 * leftSum = 0
 * totalSum = leftSum + nums[i] + rightSum
 * at each iteration calculated rightSum = totalSum - leftSum - nums[i]
 * and get abs value into arr[i] 
 * then update the leftSum += nums[i]
*/

1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int totalSum = 0;
5        int[] arr = new int[n];
6        for(int i : nums){
7            totalSum += i;
8        }
9        int leftSum = 0;
10        for(int i = 0 ; i < n ; i++){
11            int rightSum = totalSum - leftSum - nums[i]; //bcz totalSum = leftSum + nums[i] + rightSum
12            arr[i] = Math.abs(leftSum-rightSum);
13            leftSum += nums[i];
14        }
15        return arr;
16    }
17}