// Last updated: 11/25/2025, 9:32:05 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int min = (int)Math.floor(n/3);
        int count1 = 0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(count1 == 0 && nums[i]!=element2){
                element1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && nums[i]!=element1){
                element2 = nums[i];
                count2++;
            }
            else if(nums[i] == element1){
                count1++;
            }
            else if(nums[i] == element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int check1 =0;
        int check2 =0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element1) check1++;
            else if(nums[i] == element2) check2++;
        }
        if(check1 > min) arr.add(element1);
        if(check2 > min) arr.add(element2);

        return arr;
    }
}