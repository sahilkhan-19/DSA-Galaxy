// Last updated: 2/14/2026, 8:27:47 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder result = new StringBuilder();
4
5        for(String word : words){
6            int sum = 0;
7            for(int i = 0; i < word.length(); i++){
8                sum += weights[word.charAt(i) - 'a'];
9            }
10            int val = sum % 26;
11            char mapped = (char)('z' - val);
12            result.append(mapped);
13        }
14        return result.toString();
15    }
16}