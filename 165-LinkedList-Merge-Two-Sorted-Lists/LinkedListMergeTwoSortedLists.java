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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy; // create dummy, cur points to 1st dummy
    ListNode cur1 = l1;
    ListNode cur2 = l2;
    while (cur1 != null && cur2 != null){ //注意是判断cur1,cur2
        // cur1!=null
        // cur2!=null
        // cur1.val <= cur2.val
        // cur2.val > cur1.val
        if (cur1.val <= cur2.val){
            cur.next = cur1;
            cur = cur.next;
            cur1 = cur1.next;
            continue;
        } // l1 <= l2, put l1 into dummy, cur move to new list, l1 move to next, l2 does not move
        // else if (cur1.val > cur2.val)   // This stands 100%, can be ignored.

        cur.next = cur2;
        cur = cur.next;
        cur2 = cur2.next;
    }
    //l1 > l2, put l2 into dummy, cur move to new list , l2 move to next, l1 does not move
    // cur1 == null
    // cur2 == null
    // cur1 == null && cur2 == null
    if (cur1 != null){//注意是判断cur1,cur2
        cur.next = cur1;
    }
    if (cur2 != null){
       cur.next = cur2;
    }
    // cur.next = null is only needed when cur1 == null && cur2 == null,
    // this case happens ONLY when l1 and l2 are null.
    // in this case, cur.next is initially null.
    // cur.next = null;
    return dummy.next;

    }
}
