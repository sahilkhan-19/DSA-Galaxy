// Last updated: 2/10/2026, 11:10:58 AM
1class Solution {
2    public int countPrimes(int n) {
3        int count = 0 ;
4        boolean[] arr = new boolean[n+1];
5        if(n <= 2) return 0;
6        arr[0] = true;
7        arr[1] = true;
8
9        for(int i = 2 ; i*i < n ; i++){
10            if(!arr[i]){
11                for(int j = i*i ; j < n ; j+=i){
12                    if(!arr[j]){
13                        arr[j] = true;
14                    }
15                }
16            }
17        }
18        for(int i = 2; i < n ; i++){
19            if(!arr[i]) count++;
20        }
21        return count;
22    }
23}