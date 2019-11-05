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
        if(head == null) {
            return head;
        }
        ListNode h = head;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        while(p2 != null) {//p2 最多挪到tail位置
            ListNode tmp = p2.next;//每次循环都需要重新定义tmp；

            //更改箭头方向
            p2.next = p1;
            p1=p2;
            p2=tmp;
        }
        h.next = null;//原head变成tail,给tail加个null
        return p1;

     }
 }
