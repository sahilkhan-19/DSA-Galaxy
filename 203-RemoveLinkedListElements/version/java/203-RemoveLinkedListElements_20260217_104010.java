// Last updated: 2/17/2026, 10:40:10 AM
// Dummy node concept - to handle all edge cases in one sol
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
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode temp = dummy;
16        while(temp.next != null){
17            if(temp.next.val == val){
18                temp.next = temp.next.next;
19            }
20            else temp = temp.next;
21        }
22        return dummy.next;
23    }
24}