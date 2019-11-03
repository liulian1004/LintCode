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
public class Solution {//成立条件：
//left == isBalanced; right == isBalanced root+left+right = isBalanced
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root == null){
            //先判断root == null的情况
            return true;
        }
        if(!isBalanced(root.left) || !isBalanced(root.right)){//先判断是不是balance tree
            // either root.left isB false
            // or root.right isB false
            // strong enough to return false
            return false;
        }

        // root.left isB true
        // root.right isB true
        // the only thing missing up to this point is if root.left depth(0) - root.right depth(0) <=1
        return Math.abs(getDepth(root.left) -getDepth(root.right)) <=1;//判断是不是depth落差<=1
    }

     public int getDepth(TreeNode root) {
           if(root == null) {
             return 0;
         }
         return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}
