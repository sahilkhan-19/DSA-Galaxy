// Last updated: 4/5/2026, 8:22:13 AM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> list = new ArrayList<>();
5        getAns(0, nums, list, new ArrayList<>());
6        return list;
7
8    }
9    void getAns(int index, int[] nums,List<List<Integer>> list,List<Integer> ds){
10        list.add(new ArrayList<>(ds));
11        for(int i = index; i < nums.length; i++){
12            if(i != index && nums[i] == nums[i-1]) continue;
13            ds.add(nums[i]);
14            getAns(i+1, nums, list, ds);
15            ds.remove(ds.size() - 1);
16        }
17    }
18}