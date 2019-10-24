public class Dequeue {//在一开始定义全局变量
    LN tail;
    LN head;

    public Dequeue() {//初始化全局变量
        tail= head = null;
    }
   private static class LN {//定义初始化双向链表
       int val;
       LN previous;
       LN next;
       LN (int val) {
           next = previous = null;
           this.val = val;
       }
   }
    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_front(int item) {
        // write your code here
        LN n = new LN(item);
        if (head == null) {// 空linkedlist
            head=tail= n;//双指针有head,和tail，head，tail的状态都需要更新
            return;
        }
        head.previous = n; //建立双向指针
        n.next = head;
        head = n; //head指针指向n；
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {
        // write your code here
        LN n = new LN(item);
        if (tail == null) {//空linkedlist
            head=tail = n;
            return;
        }
        tail.next = n;
        n.previous = tail;
        tail = n;
    }

    /*
     * @return: An integer
     */
    public Integer pop_front() {
        // write your code here
        LN tmp = head;
        if(head == null) {//空linkedlist
            return null;
        }
        if( head== tail) {//一个元素
            head=tail=null;
            return tmp.val;
        }
        head = head.next;//两个以上元素
        head.previous = null;//注意head之前位null
        return tmp.val;

    }

    /*
     * @return: An integer
     */
    public Integer pop_back() {//需要考虑null, 1位，2位
        // write your code here
        if(tail == null) {//空linkedlist
            return null;
        }

        // return tmp.val;
        LN tmp = tail;//双指针执行
        if( head== tail) {//一个元素
            head=tail=null;
            return tmp.val;
        }
        tail = tail.previous;//两个以上元素
        tail.next = null;//注意tail之后是null
        return tmp.val;
    }
}

// one point linked List
public class Dequeue {
    ListNode dummy;

    public Dequeue() {
        // do intialization if necessary
        dummy = new ListNode(-1);
    }

    static public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public void push_front(int item) {
        // write your code here
    ListNode head = dummy.next;
    ListNode n = new ListNode(item) ;// insert new item
    dummy.next = n;// dummy == null 时也适用于这种情况
    n.next = head;

    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {

        ListNode n = new ListNode(item);
        ListNode cur = dummy;
        while (cur.next != null) {
            cur = cur.next;
        }
        // cur!=null && cur.next==null
        cur.next = n;
    }

    /*
     * @return: An integer
     */
    public int pop_front() {

        // dummy.next ?
        if (dummy.next == null) {
            return 0;
        }
        // dummy.next != null
        int res = dummy.next.val;
        dummy.next = dummy.next.next;
        return res;
    }

    /*
     * @return: An integer
     */
    public int pop_back() {

        // dummy.next?
        if (dummy.next == null) {
            return 0;
        }
        // dummy.next != null
        ListNode l1 = dummy;
        ListNode l2 = l1.next;
        while (l2.next!=null) {
            l1=l1.next;
            l2=l2.next;
        }
        // l2!=null && l2.next==null
        int res = l2.val;
        l1.next = null;
        return res;
    }
}
