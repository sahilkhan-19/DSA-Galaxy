// Last updated: 11/25/2025, 9:32:12 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int start = i;
                while(set.contains(start+1)){
                    start++;
                    count++;
                }
                longest =  Math.max(longest,count);
            }
        }
        return longest;
    }
}