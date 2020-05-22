package leetcode.linked_list;

import leetcode.linked_list.util.ListNode;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/22 10:42
 */
//������λ���Ƕѿռ��  �ǹ����  ֻҪ�� new����  ���ò����Ķ���ͬһ��ʵ��  ע�⣺����������������
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

    //��ת����ĵݹ鷽ʽ  ���Ȳ������һ���ڵ�
    public static ListNode rec_reverse(ListNode root){
        if (root == null || root.next == null)       //����Ϊ��ֱ�ӷ��أ���H.nextΪ���ǵݹ��
            return root;
        ListNode newHead = rec_reverse(root.next); //һֱѭ������β
        root.next.next = root;                       //��ת�����ָ��
        root.next = null;                          //�ǵø�ֵNULL����ֹ�������
        return newHead;
    }
    //��ת����
    public static ListNode reverse(ListNode root){
        ListNode newRoot = new ListNode(-1);
        ListNode tmp = null;
        ListNode answer = null;
        do {
            //�����ʱ����
            tmp= root.next;
            //��������еĲ���
            //������������
            root.next=answer;
            answer=root;
            root=tmp;
        }while (root!=null);
        return answer;
    }
    //�����Ƿ�� ��   myidea  ����ָ��
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
    //ɾ������ĵ�����n������
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
