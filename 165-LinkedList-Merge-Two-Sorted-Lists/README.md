https://www.lintcode.com/problem/merge-two-sorted-lists/description
ListNode cur = dummy;
ListNode cur1 = l1;
ListNode cur2 = l2;
1) pay attention on cur1 == null, cur2 == null, cur1== null && cur2 == null
2) link relationship, ie , put cur1 to cur
// cur.next = cur1; 
