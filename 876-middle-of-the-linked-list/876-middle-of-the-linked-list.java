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
    int ListNodeSize (ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int count = ListNodeSize(head)/2;
        //System.out.println("count : " + count);
        ListNode listNode = head;
        for (int i=0; i<count; i++) {
            listNode = listNode.next;
        }
        
        return listNode;
    }
}