// Last updated: 11/25/2025, 3:01:02 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;   // copy value from next node
        node.next = node.next.next;
    }
}