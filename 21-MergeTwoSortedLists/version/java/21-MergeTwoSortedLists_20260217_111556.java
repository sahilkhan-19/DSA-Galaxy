// Last updated: 2/17/2026, 11:15:56 AM
// optimal
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode(0);
14        ListNode curr = dummy;
15        while(list1 != null && list2 != null){
16            if(list1.val <= list2.val){
17                curr.next = list1;
18                curr = curr.next;
19                list1 = list1.next;
20            }else{
21                curr.next = list2;
22                curr = curr.next;
23                list2 = list2.next;
24            }
25        }
26        while(list1 != null){
27            curr.next = list1;
28            curr = curr.next;
29            list1 = list1.next;
30        }
31        while(list2 != null){
32            curr.next = list2;
33            curr = curr.next;
34            list2 = list2.next;
35        }
36        return dummy.next;
37    }
38}