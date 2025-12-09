// Last updated: 12/9/2025, 8:20:50 AM
1class Solution {
2public int reversePairs(int[] nums) {
3if (nums == null || nums.length == 0) return 0;
4return mergeSort(nums, 0, nums.length - 1);
5}
6
7private int mergeSort(int[] nums, int left, int right) {
8    if (left >= right) return 0;
9    int mid = left + (right - left) / 2;
10    int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
11
12    // Count reverse pairs
13    int j = mid + 1;
14    for (int i = left; i <= mid; i++) {
15        while (j <= right && nums[i] > 2L * nums[j]) j++;
16        count += j - (mid + 1);
17    }
18
19    // Merge step
20    int[] temp = new int[right - left + 1];
21    int i = left, k = 0;
22    j = mid + 1;
23    while (i <= mid && j <= right) {
24        if (nums[i] <= nums[j]) temp[k++] = nums[i++];
25        else temp[k++] = nums[j++];
26    }
27    while (i <= mid) temp[k++] = nums[i++];
28    while (j <= right) temp[k++] = nums[j++];
29    System.arraycopy(temp, 0, nums, left, temp.length);
30
31    return count;
32}
33
34}
35