package leetcode.tree;

import leetcode.tree.util.TreeNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 15:17
 */
//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//
//本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
public class Demo07 {
    public static TreeNode head;

    public static void main(String[] args) {

    }

    int[] nums;

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        // always choose left middle node as a root
        int p = (left + right) / 2;
        //知道 left==right==p的时候  就是递归需要结束的时候  null值也可以存  树不是满的
        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }

}
