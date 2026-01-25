// Last updated: 1/25/2026, 8:46:44 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        int n = nums.length;
4        ArrayList<Integer>  arr = new ArrayList<>();
5        for(int i = 0; i < n ; i++){
6            if(nums[i] >= 0) arr.add(nums[i]);
7        }
8        int m = arr.size();
9        if(m==0) return nums;
10        k=k%m;
11        getReverse(arr,0,k-1);
12        getReverse(arr,k,m-1);
13        getReverse(arr,0,m-1);
14
15        int index = 0;
16        for(int i =0; i < n; i++){
17            if(nums[i] >= 0){
18                nums[i] = arr.get(index++);
19            }
20        }
21        return nums;
22        
23    }
24public void getReverse(List<Integer>arr, int left, int right){
25    while(left < right){
26        int temp = arr.get(left);
27        arr.set(left,arr.get(right));
28        arr.set(right,temp);
29        left++;
30        right--;
31    }
32}
33}