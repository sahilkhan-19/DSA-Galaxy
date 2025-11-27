// Last updated: 11/27/2025, 9:50:15 AM
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
12    public ListNode reverseList(ListNode head) {
13         ListNode temp = head;
14         ListNode prev = null;
15         while(temp != null){
16            ListNode front = temp.next;
17            temp.next = prev;
18            prev = temp;
19            temp = front;
20         }
21         return prev;
22    }
23}