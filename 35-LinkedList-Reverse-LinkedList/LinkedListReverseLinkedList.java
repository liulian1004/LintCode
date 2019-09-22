/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode h = head;
        ListNode p1 = head;
        if (p1 == null) {
            return null;
        }
        ListNode p2 = p1.next;
        while(p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1=p2;
            p2= temp;
        }
        h.next = null;
        return p1;

    }
}
