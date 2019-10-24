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
 //          1
 //        /  \
 //       2    3
 //     /  \
 //    4    5

public class Solution {
    /**
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */

    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
    List<String> paths= new ArrayList<>();//空的list
    if(root == null) {
        return paths;
       }
    List<String> leftPaths= binaryTreePaths(root.left); //最后一轮 ["2->4","2->5"]
    List<String> rightPaths= binaryTreePaths(root.right);//最后一轮 ["3"]////exit退出后，程序往下执行
    for(String p: leftPaths){//如果leftpaths是空的list，不执行这一段
        paths.add(root.val + "->" + p);//循环,给leftpath的每个元素单独加“root.vol + -> " 变成['1 ->2 ->4','1->2->5']
    }
    for(String p: rightPaths){
        paths.add(root.val + "->" + p);
    }
    if (paths.size() == 0) {//只有一个节点的情况下
        paths.add(""+root.val);// “”=>String ; String+任何类型=Stringval转string
    }
    return paths;
    }

    // public class Solution {
    // /**
    //  * @param root the root of the binary tree
    //  * @return all root-to-leaf paths
    //  */
    // public List<String> binaryTreePaths(TreeNode root) {
    //     List<String> result = new ArrayList<String>();
    //     if (root == null) {
    //         return result;
    //     }
    //     helper(root, String.valueOf(root.val), result);
    //     return result;
    // }

    // private void helper(TreeNode root, String path, List<String> result) {
    //     if (root == null) {
    //         return;
    //     }

    //     if (root.left == null && root.right == null) {//叶子节点
    //         result.add(path);
    //         return;
    //     }

    //     if (root.left != null) {
    //         helper(root.left, path + "->" + String.valueOf(root.left.val), result);
             //root = 1 => helper = (2, ''1  -> 2'', result)
    //     }

    //     if (root.right != null) {
    //         helper(root.right, path + "->" + String.valueOf(root.right.val), result);
    //     }
    // }
}
