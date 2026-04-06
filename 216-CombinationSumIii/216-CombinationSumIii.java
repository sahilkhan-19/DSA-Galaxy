// Last updated: 4/6/2026, 2:25:41 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        getAns(1,0,k,n, new ArrayList<>(), list);

        return list;
    }
    void getAns(int i, int sum, int k, int n,List<Integer> ds, List<List<Integer>> list){
        if(sum > n) return;
        if(k == 0){
            if(sum == n) list.add(new ArrayList<>(ds));
            return;
        }
        if(i == 10) return;
        sum += i;
        ds.add(i);
        getAns(i+1,sum, k - 1, n, ds, list);
        sum -= i;
        ds.remove(ds.size() - 1);
        getAns(i+1,sum, k, n, ds, list);
    }
}