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
    public ListNode reverseList(ListNode head) {
        
        ListNode reverse = null;
        
        while (head != null) {
            ListNode current = head;
            head = head.next;
            current.next = reverse;
            reverse = current;
        }
        
        return reverse;
    }
}