// Last updated: 4/12/2026, 8:15:11 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5
6        for(int i = 0 ; i < n ; i++){
7            int degree = 0;
8            for(int j = 0 ; j < n ; j++){
9                if(matrix[i][j] == 1){
10                    degree++;
11                }
12            }
13            ans[i] = degree;
14        }
15        return ans;
16    }
17}