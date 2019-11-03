/**
 * Definition of Node://定义一个节点
 * class Node {
 *     public int val;
 *     public Node(int val) {
 *         this.val = val;
 *     }
 * }
 */
public class ReferenceManager {
    public Node node;

    public void copyValue(Node obj) {
        // copy value from obj to node
        int res = obj.val;
        if(obj == null){// obj为空
            return;
        }
        if(node == null){// node 为空
            node = new Node(obj.val);//node已经定义过，不需要家new node 直接 node 赋予值就行
        }
        node.val = obj.val;
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
       // node.head = obj.head;//不是linkedlist
       node = obj;
    }
}
