// Last updated: 4/6/2026, 2:25:11 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] arrS = s.toCharArray();
        char[] arr = new char[n];
        for(int i = 0 ; i < n ; i++){
            arr[indices[i]] = arrS[i];
        }
        String ans = new String(arr);
        return ans;
    }
}