// Last updated: 2/15/2026, 8:14:03 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = bulbs.size();
5        for(int bulb : bulbs){
6            if(set.contains(bulb)){
7                set.remove(bulb);
8            }else{
9                set.add(bulb);
10            }
11        }
12        List<Integer> ans = new ArrayList<>(set);
13        Collections.sort(ans);
14        return ans;
15    }
16}