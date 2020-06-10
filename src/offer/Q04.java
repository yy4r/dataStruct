package offer;

import leetcode.linked_list.util.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 14:26
 */
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class Q04 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        Q04 q04 = new Q04();
//        q04.dfs(listNode1);
        int[] ints = q04.reversePrint(listNode1);
        System.out.println(Arrays.toString(ints));
    }


    public int[] reversePrint(ListNode head) {
        //放在栈
        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public void dfs(ListNode head) {
        if (head.next == null) {
            System.out.println(head.val);
            return;
        }
        //先输出后面的
        dfs(head.next);
        //在输出自己的
        System.out.println(head.val);

    }
}
