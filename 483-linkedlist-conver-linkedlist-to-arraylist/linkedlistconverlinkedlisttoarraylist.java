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
     * @param head: the head of linked list.
     * @return: An integer list
     */
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        //int[] list = new int[20];
        List<Integer> list = new ArrayList<Integer>();
        //int i = 0;
        ListNode cur = head;
        while (cur != null){
            //int j = cur.get(i);
            list.add(cur.val);
            cur = cur.next;
            //i++;
            }
        return list;
    }
}
