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
//����һ��������, �ҵ�����������ָ���ڵ������������ȡ�
//
//�ٶȰٿ�������������ȵĶ���Ϊ���������и��� T ��������� p��q������������ȱ�ʾΪһ����� x������ x �� p��q �������� x ����Ⱦ����ܴ�һ���ڵ�Ҳ���������Լ������ȣ�����
//
//���磬�������¶�����:? root =?[3,5,1,6,2,0,8,null,null,7,4]
//
public class Demo06 {
    static Map map = new HashMap();
    static Set set = new HashSet();

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //�����pq �Ǹ�  ��ֱ�ӷ���  ע�� ������Ե� �ݹ����κζ����Գ�Ϊ��
        //������ǵݹ�ĳ���
        if (root == p || root == q) {
            return root;
        }
        //��Ҫ������pq
        //Ҫô��pq���������� Ҫôpq�����ұ����� Ҫôһ��һ��
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        return null;
        //�ݹ鷽ʽ ��̫��
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

    //�ù�ϣ�� �洢�ڵ�ĸ��ڵ�
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
