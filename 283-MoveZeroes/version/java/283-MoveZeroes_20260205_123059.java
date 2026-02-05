// Last updated: 2/5/2026, 12:30:59 PM
1class Solution {
2    public void moveZeroes(int[] arr) {
3        int n = arr.length;
4        int i = 0;
5        for(int j = 0; j < n ; j++){
6            if(arr[j]!=0){
7                int temp = arr[i];
8                arr[i] = arr[j];
9                arr[j] = temp;
10                i++;
11            }
12        }
13    }
14}