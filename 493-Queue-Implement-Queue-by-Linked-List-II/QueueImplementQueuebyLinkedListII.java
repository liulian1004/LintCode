public class Dequeue {
    LN tail;
    LN head;

    public Dequeue() {
        // do intialization if necessary
        //previous = next = null;
        //this.head = head;
        //this.tail = tail;
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
        if (head == null) {//head 还么有和 n 连接在一起
            head=tail= n;
            return;
        }
        head.previous = n; //建立双向指针
        n.next = head;
        head = n;
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {
        // write your code here
        LN n = new LN(item);
        if (tail == null) {//tail 还么有和 n 连接在一起
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
    public Integer pop_front() {//需要考虑head走到空，tail也需要指向空
        // write your code here
        LN tmp = head;
        if(head == null) {
            return null;
        }
        if( head== tail) {
            head=tail=null;
            return tmp.val;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return tmp.val;

    }

    /*
     * @return: An integer
     */
    public Integer pop_back() {//需要考虑null, 1位，2位
        // write your code here
        if(tail == null) {
            return null;
        }
        // ListNode cur = head;//单指针执行
        // if( head == tail){
        //     head = tail = null;
        //     return cur.val;
        // }
        // while (cur.next != tail){
        //   cur = cur.next;
        // }
        // ListNode tmp = tail;
        // tail= cur;
        // tail.next = null;

        // return tmp.val;
        LN tmp = tail;//双指针执行
        if( head== tail) {
            head=tail=null;
            return tmp.val;
        }
        tail = tail.previous;
        return tmp.val;
    }
}
