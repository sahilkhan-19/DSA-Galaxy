// Last updated: 2/22/2026, 9:18:21 AM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int original = n;
4        int ans = 0;
5        while(n > 0){
6            int digit = n % 10;
7            ans += getFact(digit);
8            n /= 10;
9        }
10        if(ans == original) return true;
11        else{
12            String a = String.valueOf(original);
13            String b = String.valueOf(ans);
14
15            if(a.length() != b.length()) return false;
16
17            char[] arr1 = a.toCharArray();
18            char[] arr2 = b.toCharArray();
19
20            Arrays.sort(arr1);
21            Arrays.sort(arr2);
22
23            return Arrays.equals(arr1,arr2);
24        }
25    }
26    int getFact(int n){
27        int fac = 1;
28        for(int i = n ; i >0  ; i--){
29            fac *= i;
30        }
31        return fac;
32    }
33}