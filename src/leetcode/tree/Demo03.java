package leetcode.tree;

import leetcode.tree.util.TreeNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 20:27
 */
//����һ��������������Binary Search Tree��������ת����Ϊ�ۼ�����Greater Tree)��ʹ��ÿ���ڵ��ֵ��ԭ���Ľڵ�ֵ�������д������Ľڵ�ֵ֮�͡�
//
//?
//
//���磺
//
//����: ԭʼ����������:
//              5
//            /   \
//           2     13
//
//���: ת��Ϊ�ۼ���:
//             18
//            /   \
//          20     13
//
public class Demo03 {

    TreeNode treeNode = null;
    public static void main(String[] args) {
        //��Ŀ�ĳ� �������飬ÿһ�����Ǻ������е�֮��
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
