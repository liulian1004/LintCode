https://www.lintcode.com/problem/binary-tree-path-sum/description
remember to initialize the path
1. create result path, path
2. traverse left side, right side
3. once walk to the root (root.left == null && root.right == null)  => check the sum == target, add path to result
4. return to remove the node on the path, once it's done the traverse and the result of sum != target
