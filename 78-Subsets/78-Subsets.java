// Last updated: 1/14/2026, 11:38:09 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        int n=nums.length;
        help(0,n,nums,ans,v);
        return ans;
    }
    public void help(int ind,int n,int nums[],List<List<Integer>> ans,List<Integer> v){
        if(ind==n){
            ans.add(new ArrayList<>(v));
            return;
        }
        v.add(nums[ind]);
        help(ind+1,n,nums,ans,v);
        v.remove(v.size()-1);
        help(ind+1,n,nums,ans,v);
    }
}