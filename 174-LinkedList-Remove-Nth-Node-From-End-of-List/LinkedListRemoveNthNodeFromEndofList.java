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
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
       final ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        // cur moves forward n position
        for (int i = 0; i< n ; i++){
            cur = cur.next;
        }
        // while (n>0 && cur!=null) {
        //     cur = cur.next;
        //     n--;
        // }
        // // 1. cur == null, n is bigger then the length,return orginial linkedlist
        // // 2. n==0, cur in the middle of the linkedlist.
        // if (cur == null) {
        //     return dummy.next;
        // }
        // // n==0, cur in the middle of the linkedlist.

        // // cur
        ListNode pre = dummy;
        // move pre and cur at the same time until cur reaches the end
        while (cur.next != null){
            pre = pre.next;
            cur = cur.next;
        }



        // cur points to dummy ; pre points to dummy
        // while (cur.next != null){
        //     for (int i = 0; i< n ; i++){
        //         cur = cur.next; // cur start to move n position
        //     }
        //     pre = pre.next; // pre start to move;
        //     cur = cur.next; // cur continue to move;
        // }
        // cur move to the last elememt;
        pre.next = pre.next.next;
        return dummy.next;

    }
}
