// Last updated: 11/25/2025, 9:32:06 AM
class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        
        arrayReverse(arr,0,arr.length-k-1);
        arrayReverse(arr,arr.length-k,arr.length-1);
        arrayReverse(arr,0,arr.length-1);
    }

    private void arrayReverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}