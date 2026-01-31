// Last updated: 1/31/2026, 8:20:56 PM
1class Solution {
2    public String reverseByType(String s) {
3        char[] arr = s.toCharArray();
4        int n = s.length();
5        int left = 0;
6        int right = n-1;
7        while(left<right){
8            if(!Character.isLetter(arr[left])){
9                left++;
10                continue;
11            }
12            if(!Character.isLetter(arr[right])){
13                right--;
14                continue;
15            }
16            char temp = arr[left];
17            arr[left] = arr[right];
18            arr[right] = temp;
19            left++;
20            right--;
21        }
22        left = 0;
23        right = n-1;
24        while(left<right){
25            if(Character.isLetter(arr[left])){
26                left++;
27                continue;
28            }
29            if(Character.isLetter(arr[right])){
30                right--;
31                continue;
32            }
33            char temp = arr[left];
34            arr[left] = arr[right];
35            arr[right] = temp;
36            left++;
37            right--;
38        }
39        return new String(arr);
40    }
41}