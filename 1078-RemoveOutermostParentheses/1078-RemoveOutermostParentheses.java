// Last updated: 11/27/2025, 9:27:15 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count =0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(count > 0){
                    str.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}