package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 16:32
 */
//实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
public class Demo01 {
    static List<TreeNode> list = new ArrayList<TreeNode>();
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode3.left = treeNode4;
        treeNode5.left = treeNode6;
        treeNode6.left = treeNode7;
        treeNode1.right = treeNode5;
        treeNode2.right = treeNode8;
//        new Demo01().isBalanced(treeNode1);
//        new Demo01().rec(treeNode1);
//        levelPrint(treeNode1);
        rec02(treeNode1);
        for (TreeNode treeNode : list) {
            System.out.println(treeNode.val);
        }
    }

    //递归出所有的叶子节点
    public static void rec02(TreeNode root){
        if (root.right==null&&root.left==null){
            list.add(root);
        }
        if (root.left!=null){
            rec02(root.left);
        }
        if (root.right!=null){
            rec02(root.right);
        }
    }

    /**
     * 判断树是不是平衡的   叶子节点的最大差  大于一 则代表不平衡
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int l = digui(root.left, 0);
        int r = digui(root.right, 0);
        if (Math.abs(l - r) > 1)
            return false;
        //所有的全部都是 true的情况下，返回true
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //二叉树 所有节点的左边的最大深度和右边最大深度差的绝对值 不大于一  才是平衡二叉树
    public int digui(TreeNode root, int depht) {
        if (root == null)
            return depht;
        //这里得到的是 所有的叶子节点的深度   然后取得最大的值
        return Math.max(digui(root.left, depht + 1), digui(root.right, depht + 1));
    }


    public boolean rec(TreeNode root) {
        //广度优先搜索这颗二叉树树
        System.out.println(root.val);
        if (root.left != null) {
            rec(root.left);
        }
        if (root.right != null) {
            rec(root.right);
        }
        return true;
    }

    public static void levelPrint(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = null;
        queue.offer(root);//将根节点入队
        while (!queue.isEmpty()) {
            current = queue.poll();//出队队头元素并访问
            System.out.println(current.val);
            if (current.left != null)//如果当前节点的左节点不为空入队
            {
                queue.offer(current.left);
            }
            if (current.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                queue.offer(current.right);
            }
        }
    }
}
