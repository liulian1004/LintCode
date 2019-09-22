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
     * @return: An integer
     */
    private int m = 0;
    public int maxDepth(TreeNode root) {
        // write your code here
        helper(root,1);
        return m;
    }
    private void helper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        m = Math.max(depth,m);
        helper(root.left, depth +1);
        helper(root.right,depth +1);

    }
}
