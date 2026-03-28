// Last updated: 3/28/2026, 11:59:56 AM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3        int n = code.length;
4        int[] ans = new int[n];
5
6        if(k==0) return ans;
7
8        for(int i = 0 ; i < n ; i++){
9            int sum = 0;
10            if(k >0){
11                for(int j = 1; j<= k; j++){
12                    sum += code[(i + j) % n];
13                }
14            }else{
15                for(int j = 1 ; j <= -k ; j++){
16                    sum += code[(i - j + n) % n];
17                }
18            }
19            ans[i] = sum;
20        }
21        return ans;
22    }
23}