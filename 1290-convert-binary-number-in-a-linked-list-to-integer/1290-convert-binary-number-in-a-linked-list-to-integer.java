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
import java.math.BigInteger;
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head!=null) {
            sb.append(head.val);
            head = head.next;
        }
        BigInteger bigInt = new BigInteger(sb.toString(), 2);
        return Integer.parseInt(bigInt.toString());
    }
}