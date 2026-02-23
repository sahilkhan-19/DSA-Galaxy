// Last updated: 2/23/2026, 12:58:04 PM
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
12    public ListNode swapPairs(ListNode head) {
13        if(head ==null || head.next == null) return head;
14        ListNode first = head;
15        ListNode second = head.next;
16        first.next = swapPairs(second.next);
17        second.next = first;
18        return second;
19    }
20}