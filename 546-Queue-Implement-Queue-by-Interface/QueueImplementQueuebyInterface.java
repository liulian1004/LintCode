interface InterfaceQueue {
    void push(int val);

    // define an interface for pop method
    /* write your code here */
    //Pop <Integer> pop = new Pop <>();
    Integer pop();   //定义interface内应有的动作
    // define an interface for top method
    /* write your code here */
    //Peek <Integer> top = new Peek <>();
    Integer top();//Integer可以返回null；
    }


public class MyQueue implements InterfaceQueue{//implements = 实现一种接口（InterfaceQueue)
    //Queue <Interger> que = new LinkedList<> ();
    ListNode head;//声明一个变量，没有初始化
    ListNode tail;
    public MyQueue() {
        // do intialization if necessary
        //Queue <Interger> que = new LinkedList<> ();
    }

    // implement the push method
    /* write your code here */
   @Override//overide： 继承从实现接口中定义的方法，重新些实现的method；
   public void push(int i){
       if(tail == null){
           head=tail=new ListNode(i);
       } else {
           tail.next = new ListNode(i);
           tail = tail.next;
       }

   }

    @Override
    public Integer pop() {
        // write your code here
        if(head==null) {
            //throw new NoSuchMethodException();
            return null;
        }
        int ret =head.val;
        head = head.next;
        if (head == null) {//考虑到pop光list， head为空， tail也要指向空
            tail=null;
            }
        return ret;

    }

    @Override
    public Integer top() {
        // write your code here
    if (head==null) {

        return null;
    }
    return head.val;
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */
