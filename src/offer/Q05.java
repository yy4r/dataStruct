package offer;

import leetcode.tree.util.TreeNode;

import java.util.HashMap;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 14:45
 */
//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
public class Q05 {

    public static void main(String[] args) {
        Q05 q05 = new Q05();

    }

    public TreeNode buildTree01(int[] preorder, int[] inorder) {
        return null;
    }


    //利用原理,先序遍历的第一个节点就是根。在中序遍历中通过根 区分哪些是左子树的，哪些是右子树的
    //左右子树，递归
    HashMap<Integer, Integer> map = new HashMap<>();//标记中序遍历
    int[] preorder;//保留的先序遍历

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recursive(0,0,inorder.length-1);
    }

    /**
     * @param pre_root_idx  先序遍历的索引
     * @param in_left_idx  中序遍历的索引
     * @param in_right_idx 中序遍历的索引
     */
    public TreeNode recursive(int pre_root_idx, int in_left_idx, int in_right_idx) {
        //相等就是自己
        if (in_left_idx > in_right_idx) {
            return null;
        }
        //root_idx是在先序里面的  第一次时候 取前序的首节点 作为根
        TreeNode root = new TreeNode(preorder[pre_root_idx]);
        // 有了先序的,再根据先序的，在中序中获 当前根的索引
        int idx = map.get(preorder[pre_root_idx]);

        //左子树的根节点就是 左子树的(前序遍历）第一个，就是+1,左边边界就是left，右边边界是中间区分的idx-1
        root.left = recursive(pre_root_idx + 1, in_left_idx, idx - 1);

        //全部就是注意一个点，前序遍历 连续的值 都是（左）树的根

        //由根节点在中序遍历的idx 区分成2段,idx 就是根
        //右子树的根，就是右子树（前序遍历）的第一个,就是当前根节点 加上左子树的数量
        // pre_root_idx 当前的根  左子树的长度 = 左子树的左边-右边 (idx-1 - in_left_idx +1) 。最后+1就是右子树的根了
        root.right = recursive(pre_root_idx + (idx-1 - in_left_idx +1)  + 1, idx + 1, in_right_idx);
        //最终把自己返回，自己就是他们的左或者右边，需要引用赋值过去
        //最终是 构造这棵树出来
        return root;
    }
    //root是根  left  right 是这棵树的 最小和最大的索引
    //注意  上面的树是相对的树  所有的子树 也是一棵树
    //下面这就是一棵树  最小索引  根索引（相对于前序遍历）  最大索引
    /*
    * 三个值的意思   root 是表示 根节点在前序遍历中的索引
    *               left是 中序的整棵树的头
    *               right 是中序的整棵树的尾巴
    *
    * */
    public TreeNode dfs(int root, int left, int right) {
        //最终是后序  所有dfs左dfs右根
        if (left>right){
            return null;
        }
        //声明  所有搜索 都是根据中序的结果来搜索的 前序是用来确认根的位置
        //先赋值根
        TreeNode treeNode  =  new TreeNode(preorder[root]);
        //中序数组 根索引
        int index = map.get(preorder[root]);
        //再左边子树根
        treeNode.left = dfs(root+1,left,index-1);
        //再右边子树根
        //右边子树的根的位置怎么获得
        treeNode.right = dfs(root+1+(index-left),index+1 ,right );

        //返回当前
        return treeNode;
    }



    }
