// Last updated: 2/3/2026, 10:06:31 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer>  arr = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            if(nums[i] >= 0) arr.add(nums[i]);
        }
        int m = arr.size();
        if(m==0) return nums;
        k=k%m;
        getReverse(arr,0,k-1);
        getReverse(arr,k,m-1);
        getReverse(arr,0,m-1);

        int index = 0;
        for(int i =0; i < n; i++){
            if(nums[i] >= 0){
                nums[i] = arr.get(index++);
            }
        }
        return nums;
        
    }
public void getReverse(List<Integer>arr, int left, int right){
    while(left < right){
        int temp = arr.get(left);
        arr.set(left,arr.get(right));
        arr.set(right,temp);
        left++;
        right--;
    }
}
}