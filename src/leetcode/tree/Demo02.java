package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 19:25
 */
//
//����һ�����нڵ�Ϊ�Ǹ�ֵ�Ķ�����������������������������ڵ�Ĳ�ľ���ֵ����Сֵ��
public class Demo02 {
    List<Integer> tree = new ArrayList();
    //�洢֮ǰһ���ڵ�
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;
    int max = 0;

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
//        int min = new Demo02().getMin(treeNode1);
//        int max = new Demo02().getMax(treeNode1);
//        System.out.println(max-min);
    /*    Demo02 demo02 = new Demo02();
        demo02.middle(treeNode1);
        for (Integer integer : demo02.tree) {
            System.out.println(integer);
        }*/
        //Ȼ����һ��������ж�  �����ʱ�临�Ӷ�on

        //ֱ������������� �Ƚ����ڵ�ֵ  ��Сֵ��min��
        Demo02 demo02 = new Demo02();
        demo02.betterMiddle(treeNode1);
        System.out.println(demo02.min);

    }

    //�ҵ����������ڵ����С�Ĳ�
    public int getMinimumDifference(TreeNode root) {
        return 0;
    }

    //ֱ������������Ĺ�����  �ж� �ɼ���On��ʱ�临�Ӷ� �� On�ռ临�Ӷ�
    public void betterMiddle(TreeNode root) {
        //�ҳ����ֵ����min�Ƚ�  �任
        if (root.left!=null){
            betterMiddle(root.left);
        }
        if (pre!=null){
            min = Math.min(min,Math.abs(root.val-pre.val));
        }
        pre = root;
        if (root.right!=null){
            betterMiddle(root.right);
        }

    }

    //�������
    public void middle(TreeNode root) {
        if (root.left != null) {
            middle(root.left);
        }
        tree.add(root.val);
        if (root.right != null) {
            middle(root.right);
        }

    }


    //��������da�Ľڵ�
    public int getMax(TreeNode root) {
        if (root.val > max) {
            max = root.val;
        }
        if (root.right != null) {
            getMax(root.right);
        }
        if (root.left != null) {
            getMax(root.left);
        }
        return max;
    }

    //��������xiao�Ľڵ�
    public int getMin(TreeNode root) {
        if (root.val < min) {
            min = root.val;
        }
        if (root.right != null) {
            getMin(root.right);
        }
        if (root.left != null) {
            getMin(root.left);
        }
        return min;
    }
}
