// Last updated: 2/8/2026, 9:10:19 AM
// Used stack approach
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        int n = nums.length;
4        List<Long> arr = new ArrayList<>();
5        for(int i : nums){
6            arr.add((long)i);
7            while(arr.size()>=2){
8                int x = arr.size();
9                long r = arr.get(x-1);
10                long l = arr.get(x-2);
11                if(l == r){
12                    arr.set(x-2,l+r);
13                    arr.remove(x-1);
14                }else break;
15            }
16        }
17        return arr;
18        // for(int i = 0; i < n; i++){
19        //     arr.add((long)nums[i]);
20        // }
21        // boolean check = true;
22        // while(check){
23        //     int count = 0;
24        //     for(int i = 0 ; i < arr.size() - 1; i++){
25        //         if(arr.get(i).equals(arr.get(i+1))){
26        //             long sum = arr.get(i) + arr.get(i+1);
27        //             arr.set(i,sum);
28        //             arr.remove(i+1);
29        //             count++;
30        //             break;
31        //         }
32        //     }
33        //     if(count==0) check = false;
34        // }
35    }
36}