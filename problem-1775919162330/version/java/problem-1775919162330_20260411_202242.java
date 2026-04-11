// Last updated: 4/11/2026, 8:22:42 PM
// Brute, its optimal will be: Sieve of Eratosthenes
1class Solution {
2    public int minOperations(int[] nums) {
3        int[] arr = nums;
4        int count = 0;
5
6        for(int i = 0 ; i < nums.length; i++){
7            int x = nums[i];
8
9            if(i%2 == 0){
10                int a = x;
11                while(!isPrime(a)){
12                    a++;
13                }
14                count += (a - x);
15            }else{
16                if(!isPrime(x)) continue;
17
18                int a = x;
19                while(isPrime(a)){
20                    a++;
21                }
22                count += (a-x);
23            }
24        }
25        return count;
26    }
27    private boolean isPrime(int a){
28        if(a <= 1) return false;
29
30        for(int i = 2; i * i <= a ; i++){
31            if(a % i == 0) return false;
32        }
33        return true;
34    }
35}