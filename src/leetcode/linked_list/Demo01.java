package leetcode.linked_list;

import leetcode.linked_list.util.ListNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/22 10:42
 */
//链表保存位置是堆空间的  是共享的  只要不 new对象  引用操作的都是同一个实例  注意：：：：：：：：：
public class Demo01
{
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
//        boolean loop = isLoop(listNode1);
//        System.out.println(loop);
        ListNode reverse = reverse(listNode1);
        System.out.println(reverse);
    }

    //反转链表的递归方式  首先操作最后一个节点
    public static ListNode rec_reverse(ListNode root){
        if (root == null || root.next == null)       //链表为空直接返回，而H.next为空是递归基
            return root;
        ListNode newHead = rec_reverse(root.next); //一直循环到链尾
        root.next.next = root;                       //翻转链表的指向
        root.next = null;                          //记得赋值NULL，防止链表错乱
        return newHead;
    }
    //反转链表
    public static ListNode reverse(ListNode root){
        ListNode newRoot = new ListNode(-1);
        ListNode tmp = null;
        ListNode answer = null;
        do {
            //存放临时变量
            tmp= root.next;
            //这里放所有的操作
            //新链表新链表
            root.next=answer;
            answer=root;
            root=tmp;
        }while (root!=null);
        return answer;
    }
    //链表是否成 环   myidea  快慢指针
    public static boolean isLoop(ListNode root){
        ListNode fast = root;
        ListNode slow = root;
        do {
            if (fast.next.next==null){
                return false;
            }else {
                fast = fast.next.next;
            }
            slow = slow.next;
        }while (fast!=slow);
        return true;
    }
    //删除链表的倒数第n个数字
    public static ListNode deleteNode(ListNode root,int count){
        ListNode answer = root;
        ListNode startNode= root;
        for (int i = 1;i<count;i++){
            root = root.next;
        }
        ListNode endNode = root;
        while (endNode!=null){
            startNode = startNode.next;
            endNode = endNode.next;
        }
        return answer;
    }



}
