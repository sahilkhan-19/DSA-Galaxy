// Last updated: 2/4/2026, 3:49:31 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        int n = nums.length;
4        HashSet<Integer> set = new HashSet<>();
5        for(int i : nums){
6            if(!set.add(i)) return true;
7        }
8        return false;
9    }
10}