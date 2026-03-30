// Last updated: 3/30/2026, 2:04:45 PM
1class NumArray {
2
3    int[] prefixSum;
4
5    public NumArray(int[] nums) {
6        int n = nums.length;
7        prefixSum = new int[n];
8
9        prefixSum[0] = nums[0];
10        for(int i = 1; i < n ; i++){
11            prefixSum[i] = prefixSum[i - 1] + nums[i];
12        } 
13    }
14    
15    public int sumRange(int left, int right) {
16        if(left == 0) return prefixSum[right];
17        return prefixSum[right] - prefixSum[left - 1];
18    }
19}
20
21/**
22 * Your NumArray object will be instantiated and called as such:
23 * NumArray obj = new NumArray(nums);
24 * int param_1 = obj.sumRange(left,right);
25 */