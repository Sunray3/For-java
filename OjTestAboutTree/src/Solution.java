import java.util.*;

public class Solution {

    private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    //二叉树的前序遍历，非递归迭代实现 。
    public List<Integer> preorderTraversalNor (TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur!= null || !stack.empty()){
            while((cur != null )){
                stack.push(cur);
                System.out.println(cur.val + " ");
                list.add(cur.val);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }
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
    //二叉树中序遍历 ，非递归迭代实现。
        public List<Integer> inorderTraversalNor (TreeNode root){
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            while(cur!= null || !stack.empty()){
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;

            }
            return list;
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
// 二叉树的后序遍历 ，非递归迭代实现。
        public List<Integer> postorderTraversalNor(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            TreeNode prev = null;
            while(cur!= null || !stack.empty()){
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.peek();
                if(cur.right == null || cur.right == prev){
                    stack.pop();
                    System.out.println(cur.val + " ");
                    list.add(cur.val);
                    prev = cur;
                    cur = null;
                }else{
                    cur = cur.right;
                }


            }
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
    //层序遍历:给定一个二叉树，返回其按层次遍历的节点值。
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> ret =  new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            List <Integer> list =  new ArrayList<>();
            while(size>0){
                TreeNode cur =  queue.poll();
                System.out.println(cur.val + " ");
                list.add(cur.val);
                size--;
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
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
    //给定一个二叉树，找出其最大深度。
    //二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int LeftHeight = maxDepth(root.left);
        int RightHeight = maxDepth(root.right);

        return LeftHeight > RightHeight ? LeftHeight+1:RightHeight+1;
    }
}
