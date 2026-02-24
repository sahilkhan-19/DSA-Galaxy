// Last updated: 2/24/2026, 10:32:07 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dumy = new ListNode();
14        ListNode curr = dumy;
15        int carry = 0;
16        while(l1 != null || l2 != null || carry != 0){
17            int sum = carry;
18            if(l1 != null){
19                sum += l1.val;
20                l1 = l1.next;
21            }
22            if(l2 != null){
23                sum += l2.val;
24                l2 = l2.next;
25            }
26            carry = sum /10;
27            int digit = sum % 10;
28
29            curr.next = new ListNode(digit);
30            curr = curr.next;
31        }
32        return dumy.next;
33    }
34}