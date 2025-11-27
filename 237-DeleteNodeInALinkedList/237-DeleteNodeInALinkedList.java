// Last updated: 11/27/2025, 9:27:25 AM
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