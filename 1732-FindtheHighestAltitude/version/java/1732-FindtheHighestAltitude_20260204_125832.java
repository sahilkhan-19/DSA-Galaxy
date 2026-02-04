// Last updated: 2/4/2026, 12:58:32 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n = gain.length;
4        int maxi = 0;
5        int alti = 0;
6        for(int i = 0; i < n ; i++){
7            alti += gain[i];
8            maxi = Math.max(maxi,alti);
9        }
10        return maxi;
11    }
12}