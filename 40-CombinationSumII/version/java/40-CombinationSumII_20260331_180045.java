// Last updated: 3/31/2026, 6:00:45 PM
1class Solution {
2
3    void getAns(int index, int[] arr, int target, List<List<Integer>> list, List<Integer> ds){
4        if(target == 0) {
5            list.add(new ArrayList<>(ds));
6            return;
7        }
8        for(int i = index; i < arr.length ; i++){
9            if(i > index && arr[i] == arr[i-1]) continue;
10            if( arr[i] > target) break;
11
12            ds.add(arr[i]);
13            getAns(i+1,arr,target - arr[i], list, ds);
14            ds.remove(ds.size() - 1);
15        }
16    }
17
18
19
20    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
21        List<List<Integer>> list = new ArrayList<>();
22        Arrays.sort(candidates);
23        getAns(0,candidates,target,list,new ArrayList<>());
24        return list;
25    }
26}