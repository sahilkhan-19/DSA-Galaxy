// Last updated: 1/24/2026, 1:33:24 PM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int n = arr.length;
4        int maxi = -1;
5
6        for (int i = n - 1; i >= 0; i--) {
7            int curr = arr[i];   // store original value
8            arr[i] = maxi;       // replace with right-side max
9            maxi = Math.max(maxi, curr); // update max
10        }
11        return arr;
12    }
13}