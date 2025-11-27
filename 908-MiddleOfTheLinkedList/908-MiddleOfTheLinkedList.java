// Last updated: 11/27/2025, 9:27:18 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode tortoise = head;
        ListNode hare = head;
        if(head == null) return head;
        while(hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise;
    }
}