// Last updated: 2/17/2026, 9:58:58 AM
// 2 pointer approach
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
13        if(head==null) return head;
14        while( head!=null && head.val == val){
15            head = head.next;
16        }
17        ListNode temp = head;
18        ListNode trail = null;
19        while(temp != null){
20            if(temp.val == val) {
21                trail.next = temp.next;
22                temp = trail.next;
23            }else{
24            trail = temp;
25            temp = temp.next;
26            }
27        }
28        return head;
29    }
30}