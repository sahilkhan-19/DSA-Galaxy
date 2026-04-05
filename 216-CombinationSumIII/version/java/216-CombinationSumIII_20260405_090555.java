// Last updated: 4/5/2026, 9:05:55 AM
1class Solution {
2    public List<List<Integer>> combinationSum3(int k, int n) {
3        List<List<Integer>> list = new ArrayList<>();
4        getAns(1,0,k,n, new ArrayList<>(), list);
5
6        return list;
7    }
8    void getAns(int i, int sum, int k, int n,List<Integer> ds, List<List<Integer>> list){
9        if(sum > n) return;
10        if(k == 0){
11            if(sum == n) list.add(new ArrayList<>(ds));
12            return;
13        }
14        if(i == 10) return;
15        sum += i;
16        ds.add(i);
17        getAns(i+1,sum, k - 1, n, ds, list);
18        sum -= i;
19        ds.remove(ds.size() - 1);
20        getAns(i+1,sum, k, n, ds, list);
21    }
22}