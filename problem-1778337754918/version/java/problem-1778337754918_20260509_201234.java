// Last updated: 5/9/2026, 8:12:34 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3        int n = events.length;
4        int[] arr = new int[2];
5        for(int i = 0 ; i < n ; i++){
6            if(arr[1] < 10){
7                if(events[i].equals("W")) arr[1]++;
8                else if(events[i].equals("WD") || events[i].equals("NB")) arr[0]++;
9                else{
10                    arr[0] += Integer.parseInt(events[i]);
11                }
12            }else break;
13        }
14        return arr;
15    }
16}