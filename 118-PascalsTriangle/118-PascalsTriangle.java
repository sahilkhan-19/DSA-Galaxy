// Last updated: 11/25/2025, 9:32:15 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            ans.add(getList(i));
        }
        return ans;
    }
    public List<Integer> getList (int rowNumber){
        List<Integer> list = new ArrayList<>();
        long result = 1;
        list.add(1);
        for(int i = 1; i < rowNumber; i++ ){
            result *= (rowNumber-i);
            result /= i;
            list.add((int)result);
        }
        return list;
    }
}