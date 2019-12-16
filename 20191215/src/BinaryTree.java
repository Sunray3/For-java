
class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.val = value;
    }
}
public class BinaryTree {

    public BinaryTree() {
    }
    public TreeNode buildTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }

    // 前序遍历
    void preOrderTraversal(TreeNode root){
      if (root == null){
        return;
      }
      System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(TreeNode root){
      if (root == null){
          return;
      }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");

    }
    /**
     * 节点个数：左子树的节点个数+右子树的节点个数+1
     * @param root
     * @return
     */
    // 子问题思路-求结点个数
    int getSize2(TreeNode root){
        if(root == null) {
            return 0;
        }
        int size = getSize2(root.left)
                +getSize2(root.right)+1;
        return size;
    }
     //遍历思路-求结点个数
    static int size = 0;

    void getSize1(TreeNode root){
        if(root == null) {
            return ;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
   //子问题思路--求叶子节点个数
    int getLeafSize2(TreeNode root ){
    if( root == null){
        return  0;
    }else if(root.left == null && root.right == null){
        return 1;
    }
    return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(TreeNode root){
        if(root == null) {
            return ;
        }else if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    /// 子问题思路-求第 k 层结点个数
    int getKLevelSize(TreeNode root, int k){
        if (root == null){
            return  0;
        }
        if (k == 1){
           return  1;
        }
        return getKLevelSize(root.left,k-1)+
        getKLevelSize(root.right,k-1);
    }
    //查找 val 所在结点，没有找到返回 null（按照前序遍历查找）
    TreeNode find(TreeNode root, int val){
        if ( root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        TreeNode ret = find(root.left,val);
       if ( ret != null){
           return  ret;
       }
       ret = find(root.right,val);
        if ( ret != null){
            return  ret;
        }
        return  null;
    }

}


/*public List<Integer> inOrderTraversal(TreeNode root){
    List<Integer> List =  new ArrayList<>();
    if (root == null){
        return list;
    }
    List<Integer> List1 = inOrderTraversal(root.left);
    List.addAll(list1);
    System.out.println(root.val + " ");
    List.add(root.val)
    List<Integer> List2 = inOrderTraversal(root.right);
    List.addAll(list2)
}*/
