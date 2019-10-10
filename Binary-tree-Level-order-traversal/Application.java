Treenode root = new Treenode (A[0]);
Queue<Treenode> Q = new LinkedList<> ();
Q.push(root);
int i = 1;
int n = A.length;
while (i<=n){
  Treenode left = new Treenode(A[i]);
  i++;
  Treenode right = null;
  if (i<=n){
    right = Treenode A[i];
    i++;
  }
  Treenode temp = Q.poll();//poll out root, 1st left, right, 2nd left,right
  temp.left = left;//root connect with left
  temp.right = right;//root connect with right
  Q.push(left);
  if (right != null) {//if i <=n, right == null
    Q.push(right);
  }
  return root;

}
