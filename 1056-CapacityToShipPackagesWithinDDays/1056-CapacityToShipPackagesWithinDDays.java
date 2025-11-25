// Last updated: 11/25/2025, 9:31:57 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int[] arr = getMaxAndSum(weights,n);
        int left = arr[0];
        int right = arr[1];
        while(left<=right){
            int mid = (left+right)/2;
            int daysRequired = getDays(weights,mid);
            if(daysRequired > days){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    int getDays(int[] weights, int capacity){
        int days = 1;
        int load = 0;
        int n = weights.length;
        for(int i = 0; i < n; i++){
            if(load+weights[i] > capacity){
                days++;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
    int[] getMaxAndSum(int[] weights, int n){
        int max = 0, sum = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }
        int[] arr = {max,sum};
        return arr;
    }
}