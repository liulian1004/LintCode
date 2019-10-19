public class MyQueue {
   Stack<Integer> s1 = new Stack<> ();
   Stack<Integer> s2 = new Stack<> ();
    public MyQueue() {
        // do intialization if necessary
       //Stack<Integer> s1 = new Stack<> ();
       //Stack<Integer> s2 = new Stack<> ();
        //cannot find symbol
        //s1.push(element);
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        s1.push(element);
        //S1 = [1,2,3]
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        // when s2 = empty, move all element from s1 to s2, or just pop the emplete from s2(the emplete of s2 come from the previous move from s1)
        if(s2.isEmpty()){
        move();
        }
        return s2.pop ();

    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(s2.isEmpty()){
        move();
        }
        return s2.peek ();
    }

    public void move() {
        while (!s1.isEmpty()) {
            int i = s1.pop();
            s2.push(i);
        }
    }

}
