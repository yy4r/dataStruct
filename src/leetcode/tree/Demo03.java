package leetcode.tree;

import leetcode.tree.util.TreeNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 20:27
 */
//给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
//
//?
//
//例如：
//
//输入: 原始二叉搜索树:
//              5
//            /   \
//           2     13
//
//输出: 转换为累加树:
//             18
//            /   \
//          20     13
//
public class Demo03 {

    TreeNode treeNode = null;
    public static void main(String[] args) {
        //题目改成 有序数组，每一个都是后面所有的之和
    }
    public TreeNode convertBST(TreeNode root) {
        if (root.left!=null){
            convertBST(root.left);
        }
        System.out.println(root.val);
        if (root.right!=null){
            convertBST(root.right);
        }

        return null;
    }
}
