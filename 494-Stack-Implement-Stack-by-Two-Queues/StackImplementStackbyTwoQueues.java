public class Stack {
    Queue<Integer> que1 = new LinkedList<>();
    Queue<Integer> que2 = new LinkedList<>();

    /*
     * @param x: An integer
     * @return: nothing
     */
    public void push(int x) {
        // write your code here
        que1.offer(x);
    }
   public void moveItems () {
       while (que1.size() > 1) {
        que2.offer (que1.poll());
        }
   }

   public void swapQueue() {
       Queue<Integer> tmp = que1;
       que1=que2;
       que2 = tmp;
   }
    /*
     * @return: nothing
     */
    public void pop() {
        //write your code here
        if (que1.isEmpty()) {
            return ;
        }
        if(que1.size() == 1 ){
            que1.poll();
            return;
        }
        moveItems();
        que1.poll();
        swapQueue();
    }

    /*
     * @return: An integer
     */
    public Integer top() {
        //write your code here
        if (que1.isEmpty()) {
            return null;
        }
        if(que1.size() == 1 ){
            return que1.peek();
        }
        moveItems();
        int v = que1.poll();
        swapQueue ();
        que1.offer(v);
        return v;

    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        return que1.isEmpty();
    }
}
