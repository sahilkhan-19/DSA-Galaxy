// Last updated: 4/7/2026, 10:10:58 AM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",};
4        List<String> ans = new ArrayList<>();
5        StringBuilder sb = new StringBuilder();
6        getString(digits,sb,0,ans,mapping);
7
8        return ans;
9        
10    }
11    void getString(String digits, StringBuilder sb, int index, List<String> ans, String[] mapping){
12        if(index >= digits.length()){
13            ans.add(sb.toString());
14            return;
15        }
16
17        int num = digits.charAt(index) - '0';
18        String map = mapping[num];
19
20        for(int i = 0 ; i < map.length() ; i++){
21            sb.append(map.charAt(i));
22            getString(digits, sb, index+1, ans, mapping);
23            sb.deleteCharAt(sb.length()-1);
24        }
25    }
26}