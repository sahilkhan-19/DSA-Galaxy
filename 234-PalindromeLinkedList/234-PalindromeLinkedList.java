// Last updated: 12/6/2025, 3:19:01 PM
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
12
13    ListNode reversell(ListNode head){
14        if(head==null || head.next == null) return head;
15        ListNode newHead = reversell(head.next);
16        ListNode front = head.next;
17        front.next = head;
18        head.next = null;
19        return newHead;
20    }
21    public boolean isPalindrome(ListNode head) {
22
23        if(head==null || head.next == null) return true;
24
25        ListNode tortoise = head;
26        ListNode hare = head;
27
28        while(hare.next!=null && hare.next.next != null){
29            tortoise = tortoise.next;
30            hare = hare.next.next;
31        }
32        ListNode newHead = reversell(tortoise.next);
33        ListNode first = head;
34        ListNode second = newHead;
35        while(second != null){
36            if(first.val != second.val ) {
37                reversell(newHead);
38                return false;
39            }
40            first = first.next;
41            second = second.next;
42        }
43        reversell(newHead);
44        return true;
45    }
46}