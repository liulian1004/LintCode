https://www.lintcode.com/problem/remove-nth-node-from-end-of-list/description
 cur points to n distant to head;
pre points to dummy, which has n distant with cur
cur move to the end of linkedist, cur.next == null; pre move at the same time
now pre point to the n from the end of linkedlist
remove pre.next
