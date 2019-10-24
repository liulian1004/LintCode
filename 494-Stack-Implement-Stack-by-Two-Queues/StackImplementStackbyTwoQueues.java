public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        // write your code here
        q1.offer(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        // write your code here
        while (q1.size() >1) {
            q2.offer(q1.poll());
        }
        q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(q1.isEmpty()){
            return 0;
        }
      while (q1.size() >1) {
            q2.offer(q1.poll());
        }
        int res = q1.poll();//poll出最后的数字
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        q1.offer(res);//加入最后的数字
        return res;
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        return (q1.isEmpty());
    }
}
