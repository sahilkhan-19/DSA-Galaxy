// Last updated: 4/6/2026, 2:25:44 PM
class Solution {
    public int countPrimes(int n) {
        int count = 0 ;
        boolean[] arr = new boolean[n+1];
        if(n <= 2) return 0;
        arr[0] = true;
        arr[1] = true;

        for(int i = 2 ; i*i < n ; i++){
            if(!arr[i]){
                for(int j = i*i ; j < n ; j+=i){
                    if(!arr[j]){
                        arr[j] = true;
                    }
                }
            }
        }
        for(int i = 2; i < n ; i++){
            if(!arr[i]) count++;
        }
        return count;
    }
}