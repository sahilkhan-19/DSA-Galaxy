// Last updated: 2/3/2026, 10:06:34 PM
class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
                continue;
            }
            if(!Character.isLetter(arr[right])){
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = n-1;
        while(left<right){
            if(Character.isLetter(arr[left])){
                left++;
                continue;
            }
            if(Character.isLetter(arr[right])){
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}