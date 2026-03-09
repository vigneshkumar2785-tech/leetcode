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
    public ListNode rotateRight(ListNode head, int k) {
        // Handle edge cases: empty list, single node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 1. Calculate the length and find the current tail
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 2. Adjust k to handle cases where k >= length
        k = k % length;
        if (k == 0) return head;

        // 3. Make the list circular
        tail.next = head;

        // 4. Find the new tail: it is at (length - k - 1) steps from head
        // or (length - k) steps from the current tail
        int stepsToNewTail = length - k;
        ListNode newTail = tail; 
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // 5. Break the circular link and set the new head
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
