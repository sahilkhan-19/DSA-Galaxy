// Last updated: 11/27/2025, 11:27:01 AM
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
13    public boolean hasCycle(ListNode head) {
14        ListNode tortoise = head;
15        ListNode hare = head;
16        while(hare != null && hare.next!=null){
17            tortoise = tortoise.next;
18            hare = hare.next.next;
19            if(tortoise == hare) return true;
20        }
21        return false;
22    }
23}