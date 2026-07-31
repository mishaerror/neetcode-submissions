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
    public boolean hasCycle(ListNode head) {
        /** HASH SET solution, memory O(n)
        HashSet<ListNode> visited = new HashSet<>();
        while(head != null) {
            if(visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        **/

        //efficient two-pointers
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }

        return false;
    }
}
