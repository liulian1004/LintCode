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
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.val);
        int sum = root.val;
        traverse(root, sum,path,target,result);
        return result;
    }

    private void traverse(TreeNode root, int sum, ArrayList<Integer> path, int target, List<List<Integer>> result){
        if (root.left == null && root.right == null) {
            if(sum == target) {
                result.add(new ArrayList<Integer>(path));
            }
            return;
        }
        //left
        if (root.left!= null){
            path.add(root.left.val);
            traverse(root.left, sum +root.left.val, path, target, result);
            path.remove(path.size()-1);//path归位
        }
         if (root.right!= null){
            path.add(root.right.val);
            traverse(root.right, sum +root.right.val, path, target, result);
            path.remove(path.size()-1);//path归位
        }

    }
}
