// Last updated: 2/5/2026, 6:37:17 PM
1class Solution {
2    public void rotate(int[] arr, int k) {
3        int n = arr.length;
4        k=k%n;
5        
6        arrayReverse(arr,0,arr.length-k-1);
7        arrayReverse(arr,arr.length-k,arr.length-1);
8        arrayReverse(arr,0,arr.length-1);
9    }
10
11    private void arrayReverse(int[] arr, int left, int right){
12        while(left<right){
13            int temp = arr[right];
14            arr[right] = arr[left];
15            arr[left] = temp;
16            left++;
17            right--;
18        }
19    }
20}