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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find out how many nodes are there in a list
        ListNode pt1 = head;
        int len = 0;
        while(pt1 != null) {
            len++;
            pt1 = pt1.next;
        }

        //remove the position len - n  from the end (0 indexed)
        int pos = 0;
        ListNode r = head;
        ListNode prev = null;
        while(pos < len - n && r !=null) {
            prev = r;
            r = r.next;
            pos++;
        }
        if(prev == null) {
            return r.next;
        }
        prev.next = r.next;

        return head;

    }
}
