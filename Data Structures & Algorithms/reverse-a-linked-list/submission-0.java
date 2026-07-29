/**
 * Definition for singly-linke
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
       // 
       if(head == null) {
        return null;
       }
              
       ListNode prev, curr;

       prev = null;
       curr = head;

       while(curr.next != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       curr.next = prev;

       return curr;
    }
}
