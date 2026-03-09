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
        // 1. Copy the value from the next node into this node
        node.val = node.next.val;
        
        // 2. Point this node to the one after the next node
        // This effectively "deletes" the next node from the list
        node.next = node.next.next;
    }
}
