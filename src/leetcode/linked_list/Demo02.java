package leetcode.linked_list;

import leetcode.linked_list.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 11:31
 */
//��������
public class Demo02 {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        a.next=b;
        b.next=c;
        c.next=d;
        Demo02 demo02 = new Demo02();
        boolean palindrome = demo02.isPalindrome(a);
        System.out.println(palindrome);
    }

    //�ж������ǲ��ǻ�������
    public boolean isPalindrome(ListNode head) {
        List list = new ArrayList();
        ListNode tmp = head;
        //��������
        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }
        int b = list.size() - 1;
        //˫ָ�� �Ӻ���ʹ�ǰ�涼һ��
        for (int i = 0; i < list.size(); i++) {
            if (i>=b){
                break;
            }
            if (list.get(i)!=list.get(b)){
                return false;
            }
            b--;
        }
        return true;
    }

}
