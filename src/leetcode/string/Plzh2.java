package leetcode.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 17:25
 */
public class Plzh2 {


    public static void main(String[] args) {
        //����һ����
        List<String> oneanswer = new ArrayList<>();
        String s = "�л����񹲺͹�";
        String[] split = s.split("");
        Stack stack = new Stack();
        new Plzh2().perm(stack, split);
    }

    /**
     * ��ջ����
     *
     * @param stack
     * @param target
     */
    public void perm(Stack<String> stack, String[] target) {
        if (stack.size() == target.length) {
            System.out.println(stack);
            return;
        }
        for (int i = 0; i < target.length; i++) {
            if (stack.contains(target[i])) {
                continue;
            }
            stack.push(target[i]);
            perm(stack, target);
            stack.pop();
        }


    }

}
