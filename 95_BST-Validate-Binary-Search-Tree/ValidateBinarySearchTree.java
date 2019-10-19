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
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
     //左树bst，右树bst，左子数的最大值<根节点值<右子树的最大值

    public boolean isValidBST(TreeNode root) {
        // write your code here
        return helper (Long.MIN_VALUE, root, Long.MAX_VALUE);    //不能用Integer，会碰到溢出情况
    }
    private boolean helper (long minVal,TreeNode root,long maxVal) {
        if (root == null ) {
            return true;
        }
        if (root.val <= minVal || root.val >= maxVal) { //rooint的最大/最小超出范围，判错
            return false;
        }
        return helper(minVal, root.left, root.val) && helper(root.val, root.right, maxVal);// minVal< root.left< root.val
    }
    // Solution II
    // public boolean isValidBST(long minVal, TreeNode root, long maxVal){
    //     if (root == null) {
    //         return true;
    //     }
    //     if (root.val < minVal || root.val > maxVal) {
    //         return false;
    //     }
    //     return isValidBST(minVal, root.left, root.val) && isValidBST(root.val, root.right, maxVal);
    // }
}
