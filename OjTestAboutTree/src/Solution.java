import java.util.ArrayList;
 import java.util.List;

public class Solution {

    private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
//给定一个二叉树，返回它的 前序遍历。
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> List =  new ArrayList<>();
        if (root == null){
            return List;
        }
        System.out.println(root.val + " ");
        List.add(root.val);
        List<Integer> list1 = preorderTraversal(root.left);
        List.addAll(list1);
        List<Integer> list2 = preorderTraversal(root.right);
        List.addAll(list2);
        return List;
    }
    //给定一个二叉树，返回它的中序 遍历。
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =  new ArrayList<>();
        if (root == null){
            return list;
        }
        List<Integer> list1 = inorderTraversal(root.left);
        list.addAll(list1);
        System.out.println(root.val + " ");
        list.add(root.val);
        List<Integer> list2 = inorderTraversal(root.right);
        list.addAll(list2);
        return list;
    }
    //给定一个二叉树，返回它的后序 遍历。
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> List =  new ArrayList<>();
        if (root == null){
            return List;
        }

        List<Integer> list1 = postorderTraversal(root.left);
        List.addAll(list1);
        List<Integer> list2 = postorderTraversal(root.right);
        List.addAll(list2);
        System.out.println(root.val + " ");
        List.add(root.val);
        return List;
    }
    //给定两个二叉树,如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val== q.val&&isSameTree(q.left,p.left)&&isSameTree(q.right,p.right);
    }


    }
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val== q.val&&isSameTree(q.left,p.left)&&isSameTree(q.right,p.right);
    }
    public  boolean isSubtree(TreeNode s , TreeNode t) {
        if( s== null || t == null){
            return false;
        }
        if(isSameTree(s,t)){
            return true;
        }
        if(isSubtree(s.left,t)){
            return true;
        }
        if(isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }
}
