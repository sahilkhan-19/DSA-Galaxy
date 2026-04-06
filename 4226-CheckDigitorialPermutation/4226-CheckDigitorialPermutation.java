// Last updated: 4/6/2026, 2:24:39 PM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int original = n;
        int ans = 0;
        while(n > 0){
            int digit = n % 10;
            ans += getFact(digit);
            n /= 10;
        }
        if(ans == original) return true;
        else{
            String a = String.valueOf(original);
            String b = String.valueOf(ans);

            if(a.length() != b.length()) return false;

            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        }
    }
    int getFact(int n){
        int fac = 1;
        for(int i = n ; i >0  ; i--){
            fac *= i;
        }
        return fac;
    }
}