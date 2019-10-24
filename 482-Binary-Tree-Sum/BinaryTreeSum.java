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
     * @param root: the root of the binary tree
     * @param level: the depth of the target level
     * @return: An integer
     */
    int sum = 0;//如果所有class需要调用，需要在一开始声明
    public int levelSum(TreeNode root, int level) {
        helper (root, 1, level);//depth是从1开始
        return sum;
    }
    private void helper (TreeNode root, int depth, int level) {
        if (root == null) {
            return;
        }
        if (depth == level) {
            sum += root.val;
            return;
        }
        helper(root.left, depth+1, level);//不要忘记depth+1
        helper(root.right, depth+1, level);
    }
}
