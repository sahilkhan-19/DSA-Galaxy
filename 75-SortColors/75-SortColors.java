// Last updated: 1/19/2026, 6:18:16 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int n = nums.length;
4        int low = 0;
5        int mid = 0;
6        int high = n-1;
7        while(mid <= high){
8            if(nums[mid] == 0){
9                int temp = nums[low];
10                nums[low] = nums[mid];
11                nums[mid] = temp;
12
13                mid++;
14                low++;
15            }
16            else if(nums[mid] == 1){
17                mid++;
18            }
19            else{
20                int temp = nums[mid];
21                nums[mid] = nums[high];
22                nums[high] = temp;
23
24                high--;
25            }
26        }
27    }
28}