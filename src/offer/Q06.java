package offer;

import java.util.Stack;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 16:11
 */
public class Q06 {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    int size;

    public static void main(String[] args) {

    }

    /**
     * ������ջʵ��һ�����С����е��������£���ʵ�������������� appendTail �� deleteHead ��
     * �ֱ�����ڶ���β�������������ڶ���ͷ��ɾ�������Ĺ��ܡ�(��������û��Ԫ�أ�deleteHead?�������� -1 )
     * <p>
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    public Q06() {

    }

    public void appendTail(int value) {
        //�����ֱ�ӷ�ת������
        //ջ1���ǿյĻ� ջ1����ջ2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        //ջ1��
        stack1.push(value);
        //ջ2��Ϊ�յĻ���ջ2����ջ1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    public int deleteHead() {
        if (!stack1.isEmpty()){
            return (int) stack1.pop();
        }
        return -1;
    }
}
