// Last updated: 2/17/2026, 12:07:03 PM
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
13        if(head == null) return head;
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast.next != null && fast != null){
17            slow = slow.next;
18            if(fast.next.next == null){
19                fast = fast.next;
20            }
21            else fast = fast.next.next;
22        }
23        return slow;
24    }
25}