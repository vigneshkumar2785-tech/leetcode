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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to help build the result list easily
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes to process or a carry exists
        while (l1 != null || l2 != null || carry != 0) {
            // Use 0 if a list is shorter than the other
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate sum and new carry
            int sum = carry + x + y;
            carry = sum / 10;
            
            // Create a new node with the single digit (sum % 10)
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Advance input pointers if they haven't reached the end
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual head of the result list (skipping the dummy)
        return dummyHead.next;
    }
}
