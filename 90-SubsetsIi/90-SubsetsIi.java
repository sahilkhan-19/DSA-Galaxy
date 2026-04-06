// Last updated: 4/6/2026, 2:26:01 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        getAns(0, nums, list, new ArrayList<>());
        return list;

    }
    void getAns(int index, int[] nums,List<List<Integer>> list,List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            getAns(i+1, nums, list, ds);
            ds.remove(ds.size() - 1);
        }
    }
}