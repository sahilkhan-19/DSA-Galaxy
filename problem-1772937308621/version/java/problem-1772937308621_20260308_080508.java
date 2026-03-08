// Last updated: 3/8/2026, 8:05:08 AM
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int min = Integer.MAX_VALUE;
4        int x = -1;
5
6        for(int i = 0 ; i < capacity.length; i++){
7            if(capacity[i] >= itemSize && capacity[i] < min){
8                min = capacity[i];
9                x = i;
10            }
11        }
12        return x;
13    }
14}