// Last updated: 4/26/2026, 8:17:33 AM
1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        int n = nums.length;
4        List<Integer> arr = new ArrayList<>();
5        arr.add(nums[0]);
6        if(n == 1) return arr;
7        for(int i = 1 ; i < n-1 ; i++){
8            int l = Integer.MIN_VALUE;
9            int r = Integer.MIN_VALUE;
10            for(int j = 0 ; j < i ; j++) l = Math.max(l,nums[j]);
11            for(int j = i+1 ; j < n ; j++) r = Math.max(r,nums[j]);
12            if(nums[i] > l || nums[i] > r){
13                arr.add(nums[i]);
14            }
15        }
16        arr.add(nums[n-1]);
17        return arr;
18    }
19}