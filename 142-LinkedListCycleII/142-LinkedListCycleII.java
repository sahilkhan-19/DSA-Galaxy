// Last updated: 12/4/2025, 8:06:03 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode tortoise = head;
15        ListNode hare = head;
16        while(hare != null && hare.next != null){
17            tortoise = tortoise.next;
18            hare = hare.next.next;
19            if(tortoise == hare){
20                tortoise = head;
21                while(tortoise != hare){
22                    tortoise = tortoise.next;
23                    hare = hare.next;
24                }
25                return tortoise;
26            }
27        }
28        return null;
29    }
30}