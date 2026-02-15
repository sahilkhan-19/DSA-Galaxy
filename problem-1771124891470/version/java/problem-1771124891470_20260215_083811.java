// Last updated: 2/15/2026, 8:38:11 AM
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer,Integer> freq = new HashMap<>();
4        for(int num : nums){
5            freq.put(num , freq.getOrDefault(num,0) + 1);
6        }
7        HashMap<Integer,Integer> freqCount = new HashMap<>();
8        for(int f : freq.values()){
9            freqCount.put(f, freqCount.getOrDefault(f,0) + 1);
10        }
11        for(int num : nums){
12            if(freqCount.get(freq.get(num)) == 1){
13                return num;
14            }
15        }
16        return -1;
17    }
18}