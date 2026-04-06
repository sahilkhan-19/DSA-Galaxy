// Last updated: 4/6/2026, 2:25:40 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            else set.add(i);
        }
        return false;
    }
}