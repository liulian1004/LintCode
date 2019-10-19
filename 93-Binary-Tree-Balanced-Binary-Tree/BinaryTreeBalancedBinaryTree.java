/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
//先判断左右tree是否平衡，在判断是否高度落差在1之内
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) {
            return true;
        }
        if(!isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        return Math.abs(getRootHeight(root.left) - getRootHeight(root.right)) <= 1;//从root的左右子数开始算，所以返回值要把root的edge算上
    }
    private int getRootHeight(TreeNode n ){//height = 算最deepest的edge（连接线）
    if (n == null) {
        return 0;
    }
     return Math.max(getRootHeight( n.left), getRootHeight( n.right)) + 1;

 }
}
