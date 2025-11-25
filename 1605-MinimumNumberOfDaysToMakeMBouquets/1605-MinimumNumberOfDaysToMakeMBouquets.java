// Last updated: 11/25/2025, 9:31:53 AM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long check = (long) m*k;
        int n = bloomDay.length;
        if(check > n) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            max = Math.max(max,bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }
        int left = min;
        int right = max;
        while(left<=right){
            int mid = (left+right)/2;
            if(possible(bloomDay,mid,m,k,n)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public static boolean possible(int[] bloomDay, int mid, int m, int k,int n){
        int count = 0;
        int noOfBouquets = 0;
        for(int i = 0; i < n; i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                noOfBouquets +=(count/k);
                count=0;
            }
        }
        noOfBouquets += (count/k);
        return noOfBouquets >= m;
    }
}