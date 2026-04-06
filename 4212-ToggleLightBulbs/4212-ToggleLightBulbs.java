// Last updated: 4/6/2026, 2:24:55 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set = new HashSet<>();
        int n = bulbs.size();
        for(int bulb : bulbs){
            if(set.contains(bulb)){
                set.remove(bulb);
            }else{
                set.add(bulb);
            }
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}