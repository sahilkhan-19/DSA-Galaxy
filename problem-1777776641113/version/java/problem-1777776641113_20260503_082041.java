// Last updated: 5/3/2026, 8:20:41 AM
1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        StringBuilder sb = new StringBuilder();
4        int original = n;
5        while(n > 0){
6            int digit = n % 10;
7            sb.append(digit);
8            n /= 10;
9        }
10        int reverse = Integer.parseInt(sb.toString());
11        int min = Math.min(original, reverse);
12        int max = Math.max(original, reverse);
13
14        int sum = 0;
15        for(int i = min ; i <= max ; i++){
16            if(isPrime(i)) sum += i;
17        }
18        return sum;
19    }
20
21    private boolean isPrime(int x){
22        if(x <= 1) return false;
23        if(x == 2) return true;
24        if(x % 2 == 0) return false;
25
26        for(int j = 3 ; j * j <= x ; j+= 2){
27            if(x % j == 0) return false;
28        }
29        return true;
30    }
31}