// Last updated: 1/15/2026, 8:10:53 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) return 0;
4
5        int i = 0; // pointer for the position of unique elements
6        for (int j = 1; j < nums.length; j++) {
7            if (nums[j] != nums[i]) {
8                i++;
9                nums[i] = nums[j];
10            }
11        }
12        return i + 1; // count of unique elements
13    }
14}