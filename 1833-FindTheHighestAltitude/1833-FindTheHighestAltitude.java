// Last updated: 4/6/2026, 2:25:10 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxi = 0;
        int alti = 0;
        for(int i = 0; i < n ; i++){
            alti += gain[i];
            maxi = Math.max(maxi,alti);
        }
        return maxi;
    }
}