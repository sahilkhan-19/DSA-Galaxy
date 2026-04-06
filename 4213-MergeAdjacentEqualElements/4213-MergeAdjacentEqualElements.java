// Last updated: 4/6/2026, 2:24:51 PM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n = nums.length;
        List<Long> arr = new ArrayList<>();
        for(int i : nums){
            arr.add((long)i);
            while(arr.size()>=2){
                int x = arr.size();
                long r = arr.get(x-1);
                long l = arr.get(x-2);
                if(l == r){
                    arr.set(x-2,l+r);
                    arr.remove(x-1);
                }else break;
            }
        }
        return arr;
        // for(int i = 0; i < n; i++){
        //     arr.add((long)nums[i]);
        // }
        // boolean check = true;
        // while(check){
        //     int count = 0;
        //     for(int i = 0 ; i < arr.size() - 1; i++){
        //         if(arr.get(i).equals(arr.get(i+1))){
        //             long sum = arr.get(i) + arr.get(i+1);
        //             arr.set(i,sum);
        //             arr.remove(i+1);
        //             count++;
        //             break;
        //         }
        //     }
        //     if(count==0) check = false;
        // }
    }
}