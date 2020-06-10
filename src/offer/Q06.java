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
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead?操作返回 -1 )
     * <p>
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    public Q06() {

    }

    public void appendTail(int value) {
        //这个是直接反转过来了
        //栈1不是空的话 栈1出到栈2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        //栈1进
        stack1.push(value);
        //栈2不为空的话，栈2出到栈1
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
