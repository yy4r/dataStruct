package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 13:55
 */
//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//
//例如，给定如下二叉树:? root =?[3,5,1,6,2,0,8,null,null,7,4]
//
public class Demo06 {
    static Map map = new HashMap();
    static Set set = new HashSet();

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果是pq 是根  则直接返回  注意 根是相对的 递归中任何都可以成为根
        //这里就是递归的出口
        if (root == p || root == q) {
            return root;
        }
        //先要搜索到pq
        //要么在pq都在左子树 要么pq都在右边子树 要么一左一右
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        return null;
        //递归方式 不太懂
    }

    public TreeNode lowestCommonAncestor01(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tmp_p = p;
        TreeNode tmp_q = q;
        while (tmp_p != null) {
            set.add(tmp_p.val);
            tmp_p = (TreeNode) map.get(tmp_p.val);
        }
        while (tmp_q != null) {
            if (set.contains(tmp_q)) {
                return tmp_q;
            }
            tmp_q = (TreeNode) map.get(tmp_q.val);
        }
        return null;
    }

    //用哈希表 存储节点的父节点
    public void dfs(TreeNode root) {
        if (root.left != null) {
            map.put(root.left.val, root);
            dfs(root.left);
        }
        if (root.right != null) {
            map.put(root.right, root);
            dfs(root.right);
        }
        return;
    }

}
