// Last updated: 3/29/2026, 12:40:37 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4        getAns(0,target,candidates,new ArrayList<>(),list);
5        return list;
6    }
7    void getAns(int index, int target,int[] candidates, List<Integer> l ,List<List<Integer>> list ){
8        if(index == candidates.length){
9            if(target == 0){
10                list.add(new ArrayList<>(l));
11            }
12            return;
13        }
14        if(target >= candidates[index]){
15            l.add(candidates[index]);
16            getAns(index, target - candidates[index], candidates, l, list);
17            l.remove(l.size() - 1);
18        }
19        getAns(index+1, target, candidates, l, list);
20    }
21}