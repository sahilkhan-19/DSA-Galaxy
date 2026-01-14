// Last updated: 1/14/2026, 11:35:52 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> sub = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        getSub(0,temp,nums,sub);
6        return sub;
7    }
8    //[3,1,2]
9    //3,1,2 - 3,1 - 3,2 - 3 <- LEFT TREE
10    //1,2 - 1 - 2 - {}
11    void getSub(int index, List<Integer> temp,int[] nums,List<List<Integer>> sub){
12        if(index >= nums.length){
13            sub.add(new ArrayList<>(temp));
14            return;
15        }
16        temp.add(nums[index]);
17        getSub(index+1,temp,nums, sub);
18        temp.remove(temp.size() - 1);
19        getSub(index+1,temp,nums,sub);
20    }
21}