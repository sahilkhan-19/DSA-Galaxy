// Last updated: 11/25/2025, 9:31:58 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = getMax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (getTotalHours(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i : piles) {
            if (i > max) max = i;
        }
        return max;
    }

    long getTotalHours(int[] piles, int k) {
        long totalHours = 0; // ✅ long to avoid overflow
        for (int i : piles) {
            totalHours += (i + k - 1) / k; // ✅ integer ceil division
        }
        return totalHours;
    }
}
