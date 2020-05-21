package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.LinkedList;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 16:32
 */
//ʵ��һ�����������������Ƿ�ƽ�⡣����������У�ƽ�����Ķ������£�����һ���ڵ㣬�����������ĸ߶Ȳ���� 1��
public class Demo01 {
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
        levelPrint(treeNode1);
    }

    /**
     * �ж����ǲ���ƽ���   Ҷ�ӽڵ������  ����һ �����ƽ��
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
        //���е�ȫ������ true������£�����true
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //������ ���нڵ����ߵ������Ⱥ��ұ������Ȳ�ľ���ֵ ������һ  ����ƽ�������
    public int digui(TreeNode root, int depht) {
        if (root == null)
            return depht;
        //����õ����� ���е�Ҷ�ӽڵ�����   Ȼ��ȡ������ֵ
        return Math.max(digui(root.left, depht + 1), digui(root.right, depht + 1));
    }


    public boolean rec(TreeNode root) {
        //�������������Ŷ�������
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
        queue.offer(root);//�����ڵ����
        while (!queue.isEmpty()) {
            current = queue.poll();//���Ӷ�ͷԪ�ز�����
            System.out.println(current.val);
            if (current.left != null)//�����ǰ�ڵ����ڵ㲻Ϊ�����
            {
                queue.offer(current.left);
            }
            if (current.right != null)//�����ǰ�ڵ���ҽڵ㲻Ϊ�գ����ҽڵ����
            {
                queue.offer(current.right);
            }
        }
    }
}
