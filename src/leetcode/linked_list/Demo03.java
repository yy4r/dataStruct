package leetcode.linked_list;

import leetcode.linked_list.util.ListNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 13:40
 */
//���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ�
//����: head = [4,5,1,9], node = 1
//���: [4,5,9]
//����: ������������ֵΪ?1?�ĵ������ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 5 -> 9.
//�������ٰ��������ڵ㡣
//���������нڵ��ֵ����Ψһ�ġ�
//�����Ľڵ�Ϊ��ĩβ�ڵ㲢��һ���������е�һ����Ч�ڵ㡣
//��Ҫ����ĺ����з����κν����
public class Demo03 {

    public static void main(String[] args) {
        String s = ((Integer) (-1548295291)).toString();
        System.out.println(s);

    }
    public void deleteNode(ListNode node) {
        //����һ���ڵ㸳ֵ����ǰ�ڵ�
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
