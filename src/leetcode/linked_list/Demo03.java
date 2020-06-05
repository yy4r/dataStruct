package leetcode.linked_list;

import leetcode.linked_list.util.ListNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 13:40
 */
//请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点
//输入: head = [4,5,1,9], node = 1
//输出: [4,5,9]
//解释: 给定你链表中值为?1?的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
//链表至少包含两个节点。
//链表中所有节点的值都是唯一的。
//给定的节点为非末尾节点并且一定是链表中的一个有效节点。
//不要从你的函数中返回任何结果。
public class Demo03 {

    public static void main(String[] args) {
        String s = ((Integer) (-1548295291)).toString();
        System.out.println(s);

    }
    public void deleteNode(ListNode node) {
        //将下一个节点赋值给当前节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
