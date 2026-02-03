// Last updated: 2/3/2026, 10:06:52 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxi = -1;

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];   // store original value
            arr[i] = maxi;       // replace with right-side max
            maxi = Math.max(maxi, curr); // update max
        }
        return arr;
    }
}