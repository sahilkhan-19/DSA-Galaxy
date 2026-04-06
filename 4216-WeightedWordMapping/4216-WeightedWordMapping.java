// Last updated: 4/6/2026, 2:24:47 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for(String word : words){
            int sum = 0;
            for(int i = 0; i < word.length(); i++){
                sum += weights[word.charAt(i) - 'a'];
            }
            int val = sum % 26;
            char mapped = (char)('z' - val);
            result.append(mapped);
        }
        return result.toString();
    }
}