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

//树的节点next 本身是null 所以只要是本身不是null  .next是没有关系的  只要不.next.next就行了  在.next的时候做判断即可
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
    //判断两棵树是否同样的构造   值也相同  这是简单的方式
    public static boolean isSame(TreeNode root01,TreeNode root02){
        if (root01==null&&root02==null){
            return true;
        }
        if (root01==null||root02==null){
            return false;
        }
        //值也要相同 才进行下一步的递归 不然直接false
        if (root01.val!=root02.val){
            return false;
        }
        return isSame(root01.left,root02.left)&&isSame(root01.right,root02.right);
    }
    //判断两棵树是否相同构造并且值也要相同
    public static boolean isSameTree(TreeNode root01,TreeNode root02){
        //拆解为 左边子树和右边子树都是相同的构造
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

    //所有根节点到叶子节点的路径
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new LinkedList<String>();
        helper(root,list,new String());
        return list;
    }
    //递归
    //递归最好不要改变值，定义的值，自己调用自己 ，如果从始至终 s 的原本值是不变的 只是随着一层一层的变化
    //这样才能产生回溯法
    //对象类型传地址引用 直接修改相同的堆空间的真实对象值即可
    public static void helper(TreeNode root,List<String>list,String s){
        if(root==null)                             //root为空，易知，只有一种情况，那就是题目所给是空树。
            return;
        if(root.left==null&&root.right==null){    //没有左右孩子,当前节点是叶子节点,所以形成一条路径=s(根节点到父节点路径)+当前节点
            list.add(s+root.val);
            return ;
        }
        if(root.left!=null)
            helper(root.left,list,s+root.val+"->");  //存在左孩子,所以到当前节点路径=s(根节点到父节点路径)+当前节点值+"->"
        if(root.right!=null)
            helper(root.right,list,s+root.val+"->"); //同理
    }
    //递归找出从根节点到叶子节点的值的和为指定值的所有的路线
    public static void sameHelper(TreeNode root,List<String>list,String s,int target,int sum){
        if (root==null){
            return;
        }
        //叶子节点
        if (root.left==null&&root.right==null){
            //永远不要出现赋值的情况  不然递归就乱了  类似下方
//            sum+=root.val;
            if ((sum+root.val)==target){
                list.add(s+root.val);
            }
            return;
        }
        //如果左或者右边孩子不是空
    if (root.left!=null){
        sameHelper(root.left,list,s+root.val+"-",target,sum+root.val);
    }
    if (root.right!=null){
        sameHelper(root.right,list,s+root.val+"-",target,sum+root.val);
    }
    }
    //获取树的高度
    public static int getTreeHeight(TreeNode root,int depth){
        //树的高度拆解为  左边的树的最高的高度+1 和  右边的树的最高的高度+1 的最大值
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



    //获得所有叶子节点的和
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
    //非递归的方式 得到所有叶子节点和
    public static int leafSum(TreeNode root){
        //bfs树
        Queue<TreeNode> queue = new LinkedList();
        TreeNode currentNode = null;
        //根节点入队
        queue.offer(root);
        //队列不为空  遍历
        while (!queue.isEmpty()){
            //出队
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
