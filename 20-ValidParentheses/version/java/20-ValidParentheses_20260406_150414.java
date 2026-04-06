// Last updated: 4/6/2026, 3:04:14 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> ds = new Stack<>();
4
5        for(int i = 0 ; i < s.length() ; i++){
6            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
7                ds.push(s.charAt(i));
8            }else{
9                if(ds.size() == 0) return false;
10
11                if((ds.peek() == '(' && s.charAt(i) == ')') || (ds.peek() == '{' && s.charAt(i) == '}') || (ds.peek() == '[' && s.charAt(i) == ']')){
12                    ds.pop();
13                }else{
14                    return false;
15                }
16            }
17
18        }
19        return ds.size() == 0;
20    }
21}