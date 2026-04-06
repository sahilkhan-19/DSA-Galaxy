// Last updated: 4/6/2026, 2:24:12 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0 ; i < s.length() ; i++){
5            if(sb.length() != 0 && sb.charAt(sb.length() - 1) == s.charAt(i)){
6                sb.deleteCharAt(sb.length() - 1);
7            }else{
8                sb.append(s.charAt(i));
9            }
10        }
11        return sb.toString();
12    }
13}