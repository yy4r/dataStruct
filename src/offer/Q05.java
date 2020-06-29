package offer;

import leetcode.tree.util.TreeNode;

import java.util.HashMap;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 14:45
 */
//����ĳ��������ǰ���������������Ľ�������ؽ��ö����������������ǰ���������������Ľ���ж������ظ������֡�
public class Q05 {

    public static void main(String[] args) {
        Q05 q05 = new Q05();

    }

    public TreeNode buildTree01(int[] preorder, int[] inorder) {
        return null;
    }


    //����ԭ��,��������ĵ�һ���ڵ���Ǹ��������������ͨ���� ������Щ���������ģ���Щ����������
    //�����������ݹ�
    HashMap<Integer, Integer> map = new HashMap<>();//����������
    int[] preorder;//�������������

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recursive(0,0,inorder.length-1);
    }

    /**
     * @param pre_root_idx  �������������
     * @param in_left_idx  �������������
     * @param in_right_idx �������������
     */
    public TreeNode recursive(int pre_root_idx, int in_left_idx, int in_right_idx) {
        //��Ⱦ����Լ�
        if (in_left_idx > in_right_idx) {
            return null;
        }
        //root_idx�������������  ��һ��ʱ�� ȡǰ����׽ڵ� ��Ϊ��
        TreeNode root = new TreeNode(preorder[pre_root_idx]);
        // ���������,�ٸ�������ģ��������л� ��ǰ��������
        int idx = map.get(preorder[pre_root_idx]);

        //�������ĸ��ڵ���� ��������(ǰ���������һ��������+1,��߽߱����left���ұ߽߱����м����ֵ�idx-1
        root.left = recursive(pre_root_idx + 1, in_left_idx, idx - 1);

        //ȫ������ע��һ���㣬ǰ����� ������ֵ ���ǣ������ĸ�

        //�ɸ��ڵ������������idx ���ֳ�2��,idx ���Ǹ�
        //�������ĸ���������������ǰ��������ĵ�һ��,���ǵ�ǰ���ڵ� ����������������
        // pre_root_idx ��ǰ�ĸ�  �������ĳ��� = �����������-�ұ� (idx-1 - in_left_idx +1) �����+1�����������ĸ���
        root.right = recursive(pre_root_idx + (idx-1 - in_left_idx +1)  + 1, idx + 1, in_right_idx);
        //���հ��Լ����أ��Լ��������ǵ�������ұߣ���Ҫ���ø�ֵ��ȥ
        //������ �������������
        return root;
    }
    //root�Ǹ�  left  right ��������� ��С����������
    //ע��  �����������Ե���  ���е����� Ҳ��һ����
    //���������һ����  ��С����  �������������ǰ�������  �������
    /*
    * ����ֵ����˼   root �Ǳ�ʾ ���ڵ���ǰ������е�����
    *               left�� �������������ͷ
    *               right ���������������β��
    *
    * */
    public TreeNode dfs(int root, int left, int right) {
        //�����Ǻ���  ����dfs��dfs�Ҹ�
        if (left>right){
            return null;
        }
        //����  �������� ���Ǹ�������Ľ���������� ǰ��������ȷ�ϸ���λ��
        //�ȸ�ֵ��
        TreeNode treeNode  =  new TreeNode(preorder[root]);
        //�������� ������
        int index = map.get(preorder[root]);
        //�����������
        treeNode.left = dfs(root+1,left,index-1);
        //���ұ�������
        //�ұ������ĸ���λ����ô���
        treeNode.right = dfs(root+1+(index-left),index+1 ,right );

        //���ص�ǰ
        return treeNode;
    }



    }