package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 11:43
 */
//找出二叉搜索树 第k小的数字
public class Demo05 {
    static List list = new ArrayList();
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
      /*  sortTree(node1);
        System.out.println(list.toString());*/
      Demo05 demo05 = new Demo05();
      demo05.kthSmallest(node1, 5);
    }

    public int kthSmallest(TreeNode root, int k) {
        sortTree(root);
        int o = (int)list.get(k - 1);
        System.out.println(o);
        return o;
    }

    public static void sortTree(TreeNode root){
        if (root==null){
            return;
        }
        sortTree(root.left);
        list.add(root.val);
        sortTree(root.right);
    }

}
