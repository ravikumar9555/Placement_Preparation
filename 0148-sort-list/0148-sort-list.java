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
      ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Helper function to merge two sorted linked lists.
    ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1); // Create a dummy node to simplify code.
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them.
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next; // Return the merged list.
    }
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list using the slow and fast pointer technique.
        ListNode middle = findMiddle(head);

        // Split the list into two halves.
        ListNode leftHalf = head;
        ListNode rightHalf = middle.next;
        middle.next = null;

        // Recursively sort both halves.
        leftHalf = sortList(leftHalf);
        rightHalf = sortList(rightHalf);

        // Merge the sorted halves.
        return merge(leftHalf, rightHalf);
    }
}