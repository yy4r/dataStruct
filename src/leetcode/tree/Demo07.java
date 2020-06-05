package leetcode.tree;

import leetcode.tree.util.TreeNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 15:17
 */
//��һ�������������е��������飬ת��Ϊһ�ø߶�ƽ�������������
//
//�����У�һ���߶�ƽ���������ָһ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������ 1��
public class Demo07 {
    public static TreeNode head;

    public static void main(String[] args) {

    }

    int[] nums;

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        // always choose left middle node as a root
        int p = (left + right) / 2;
        //֪�� left==right==p��ʱ��  ���ǵݹ���Ҫ������ʱ��  nullֵҲ���Դ�  ����������
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
