// Last updated: 2/6/2026, 8:27:18 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int p = m-1;
4        int q = n-1;
5        int k = m+n-1;
6
7        while(p>=0 && q >=0){
8            if(nums1[p] > nums2[q]){
9                nums1[k--] = nums1[p--];
10            }else{
11                nums1[k--] = nums2[q--];
12            }
13        }
14        while(q >= 0){
15            nums1[k--] = nums2[q--];
16        }
17
18    }
19}