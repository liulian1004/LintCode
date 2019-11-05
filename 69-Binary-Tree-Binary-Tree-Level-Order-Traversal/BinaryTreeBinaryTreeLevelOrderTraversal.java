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
         //List<List<Integer>> res = new ArrayList<>();//List套嵌需要和返回值形式一样
         if(root == null) {
             return null;//why not null?
             //return res;
         }
         List<List<Integer>> res = new ArrayList<>();//List套嵌需要和返回值形式一样
         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty()){
             List<Integer> level = new ArrayList<>();
             int n = queue.size();
             for(int i = 0 ;i<n;i++){
                 TreeNode cur = queue.poll();
                 level.add(cur.val);

                 if(cur.left != null){
                      queue.offer(cur.left);
                 }
                 if(cur.right != null){
                    queue.offer(cur.right);
                 }
             }
             res.add(level);//list.add 添加新元素的写法
         }
        return res;
     }
 }
