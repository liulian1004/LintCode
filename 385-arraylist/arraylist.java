public class ArrayListManager {
    /**
     * @param n: You should generate an array list of n elements.
     * @return: The array list your just created.
     */

    //ArrayList<Integer> list = new ArrayList<>();// static 的函数只能调用static里面的变量，所以这里声明的函数在下面的staic里面用不了，需要在static里面单独调用

    public static ArrayList<Integer> create(int n) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< n; i++){
            list.add(i);
        }
        return list;
    }

    /**
     * @param list: The list you need to clone
     * @return: A deep copyed array list from the given list
     */
    public static ArrayList<Integer> clone(ArrayList<Integer> list) {
        // Write your code here
        ArrayList<Integer> n1 = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            n1.add(list.get(i));
        }
        return n1;
    }

    /**
     * @param list: The array list to find the kth element
     * @param k: Find the kth element
     * @return: The kth element
     */
    public static int get(ArrayList<Integer> list, int k) {
        // Write your code here
        return list.get(k);
    }

    /**
     * @param list: The array list
     * @param k: Find the kth element, set it to val
     * @param val: Find the kth element, set it to val
     */
    public static void set(ArrayList<Integer> list, int k, int val) {
        // write your code here
        list.set(k,val);

    }

    /**
     * @param list: The array list to remove the kth element
     * @param k: Remove the kth element
     */
    public static void remove(ArrayList<Integer> list, int k) {
        // write tour code here
        list.remove(k);
    }

    /**
     * @param list: The array list.
     * @param val: Get the index of the first element that equals to val
     * @return: Return the index of that element
     */
    public static int indexOf(ArrayList<Integer> list, int val) {
        // Write your code here
        int i = 0;
        while(i != list.size()){
            if(list.get(i) == val) {
                break;
            }else{
                i++;
            }
        }
        if(i< list.size()) {
            return i;
        } else{
            return -1;
        }
    }
}
