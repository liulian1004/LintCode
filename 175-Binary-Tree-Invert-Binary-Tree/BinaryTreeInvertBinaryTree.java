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

public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
     // recursion
    // public void invertBinaryTree(TreeNode root) {
    //     // write your code here
    // if (root == null){
    //     return;
    // }
    // TreeNode temp = root.left;
    // root.left = root.right;
    // root.right = temp;
    // invertBinaryTree(root.left);
    // invertBinaryTree(root.right);//需要把左右子数都走一遍
    // }

    // iteration (non-recursion)
    public void invertBinaryTree(TreeNode root) {//对单独的node先压后弹，弹出的点进行左右子数switch
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            visit(node);
            if(node.left!=null) {
                stack.push(node.left);
            }
            if(node.right!=null) {
                stack.push(node.right);
            }
        }
    }

    private void visit(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
