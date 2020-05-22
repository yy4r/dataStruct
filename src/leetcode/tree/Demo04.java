package leetcode.tree;

import leetcode.tree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/22 11:54
 */

//���Ľڵ�next ������null ����ֻҪ�Ǳ�����null  .next��û�й�ϵ��  ֻҪ��.next.next������  ��.next��ʱ�����жϼ���
public class Demo04
{
    public static int sum;
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
//        System.out.println(getLeafSum(treeNode1));
//        System.out.println(leafSum(treeNode1));
//        System.out.println(getTreeHeight(treeNode1,0));
//        System.out.println(isSameTree(treeNode1,treeNode1));
//        System.out.println(binaryTreePaths(treeNode1));
        List list = new ArrayList();
        sameHelper(treeNode1,list,"",10,0);
        System.out.println(list);
    }
    //�ж��������Ƿ�ͬ���Ĺ���   ֵҲ��ͬ  ���Ǽ򵥵ķ�ʽ
    public static boolean isSame(TreeNode root01,TreeNode root02){
        if (root01==null&&root02==null){
            return true;
        }
        if (root01==null||root02==null){
            return false;
        }
        //ֵҲҪ��ͬ �Ž�����һ���ĵݹ� ��Ȼֱ��false
        if (root01.val!=root02.val){
            return false;
        }
        return isSame(root01.left,root02.left)&&isSame(root01.right,root02.right);
    }
    //�ж��������Ƿ���ͬ���첢��ֵҲҪ��ͬ
    public static boolean isSameTree(TreeNode root01,TreeNode root02){
        //���Ϊ ����������ұ�����������ͬ�Ĺ���
        if (root01.val!=root02.val){
            return false;
        }
        if (root01.left==null&&root02.left==null){
            return isSameTree(root01.right,root02.right);
        }
        if (root01.right==null&&root02.right==null){
            return isSameTree(root01.left,root02.left);
        }
        if (root01.left==null&&root02.left==null&&root01.right==null&&root02.right==null){
            return true;
        }

        return isSameTree(root01.left,root02.left)&&isSameTree(root01.right,root02.right);

    }

    //���и��ڵ㵽Ҷ�ӽڵ��·��
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new LinkedList<String>();
        helper(root,list,new String());
        return list;
    }
    //�ݹ�
    //�ݹ���ò�Ҫ�ı�ֵ�������ֵ���Լ������Լ� �������ʼ���� s ��ԭ��ֵ�ǲ���� ֻ������һ��һ��ı仯
    //�������ܲ������ݷ�
    //�������ʹ���ַ���� ֱ���޸���ͬ�Ķѿռ����ʵ����ֵ����
    public static void helper(TreeNode root,List<String>list,String s){
        if(root==null)                             //rootΪ�գ���֪��ֻ��һ��������Ǿ�����Ŀ�����ǿ�����
            return;
        if(root.left==null&&root.right==null){    //û�����Һ���,��ǰ�ڵ���Ҷ�ӽڵ�,�����γ�һ��·��=s(���ڵ㵽���ڵ�·��)+��ǰ�ڵ�
            list.add(s+root.val);
            return ;
        }
        if(root.left!=null)
            helper(root.left,list,s+root.val+"->");  //��������,���Ե���ǰ�ڵ�·��=s(���ڵ㵽���ڵ�·��)+��ǰ�ڵ�ֵ+"->"
        if(root.right!=null)
            helper(root.right,list,s+root.val+"->"); //ͬ��
    }
    //�ݹ��ҳ��Ӹ��ڵ㵽Ҷ�ӽڵ��ֵ�ĺ�Ϊָ��ֵ�����е�·��
    public static void sameHelper(TreeNode root,List<String>list,String s,int target,int sum){
        if (root==null){
            return;
        }
        //Ҷ�ӽڵ�
        if (root.left==null&&root.right==null){
            //��Զ��Ҫ���ָ�ֵ�����  ��Ȼ�ݹ������  �����·�
//            sum+=root.val;
            if ((sum+root.val)==target){
                list.add(s+root.val);
            }
            return;
        }
        //���������ұߺ��Ӳ��ǿ�
    if (root.left!=null){
        sameHelper(root.left,list,s+root.val+"-",target,sum+root.val);
    }
    if (root.right!=null){
        sameHelper(root.right,list,s+root.val+"-",target,sum+root.val);
    }
    }
    //��ȡ���ĸ߶�
    public static int getTreeHeight(TreeNode root,int depth){
        //���ĸ߶Ȳ��Ϊ  ��ߵ�������ߵĸ߶�+1 ��  �ұߵ�������ߵĸ߶�+1 �����ֵ
        if (root.left==null&&root.right==null){
            return depth+1;
        }
        if (root.left!=null){
            return getTreeHeight(root.left,depth+1);
        }
        if (root.right!=null){
            return getTreeHeight(root.right,depth+1);
        }
        return Math.max(getTreeHeight(root.left,depth+1),getTreeHeight(root.right,depth+1));
    }



    //�������Ҷ�ӽڵ�ĺ�
    public static int getLeafSum(TreeNode root){
        if (root.right==null&&root.left==null){
            return root.val;
        }
        if (root.left==null){
            return getLeafSum(root.right);
        }
        if (root.right==null){
            return getLeafSum(root.left);
        }
        return getLeafSum(root.left)+getLeafSum(root.right);
    }
    //�ǵݹ�ķ�ʽ �õ�����Ҷ�ӽڵ��
    public static int leafSum(TreeNode root){
        //bfs��
        Queue<TreeNode> queue = new LinkedList();
        TreeNode currentNode = null;
        //���ڵ����
        queue.offer(root);
        //���в�Ϊ��  ����
        while (!queue.isEmpty()){
            //����
            currentNode = queue.poll();
            if (currentNode.left!=null){
                queue.offer(currentNode.left);
            }
            if (currentNode.right!=null){
                queue.offer(currentNode.right);
            }
            if (currentNode.right==null&&currentNode.left==null){
                sum+=currentNode.val;
            }
        }
        return sum;
    }
}
