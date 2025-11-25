// Last updated: 11/25/2025, 9:32:21 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] += 1;
            return digits;
        }else if(n==1 && digits[0]==9){
            int[] arr = new int[2];
            arr[0]= 1;
            return arr;
        }else if(n==1 && digits[0] != 9) {
            digits[0] += 1;
            return digits;
        }
        else if(digits[n-1] == 9){
            for(int i = n-1; i>=0; i--){
                if(digits[i] == 9) digits[i] = 0;
                else if(digits[i] != 9){
                    digits[i] += 1;
                    return digits;
                }
            }
            int[] arr = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}