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
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<> ();
        //List<Integer> tmp = new ArrayList<> ();
        if ( root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<> ();
        queue.offer(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> tmp = new ArrayList<> ();//每次loop tmp都需要更新
            for (int i =0; i<n ;i++){
                TreeNode cur = queue.poll();
                tmp.add(cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
