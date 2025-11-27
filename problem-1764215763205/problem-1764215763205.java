// Last updated: 11/27/2025, 9:26:03 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode middleNode(ListNode head) {
13        ListNode temp = head;
14        ListNode tortoise = head;
15        ListNode hare = head;
16        if(head == null) return head;
17        while(hare != null && hare.next != null){
18            tortoise = tortoise.next;
19            hare = hare.next.next;
20        }
21        return tortoise;
22    }
23}