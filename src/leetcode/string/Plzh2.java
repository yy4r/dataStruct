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
        //保存一个答案
        List<String> oneanswer = new ArrayList<>();
        String s = "中华人民共和国";
        String[] split = s.split("");
        Stack stack = new Stack();
        new Plzh2().perm(stack, split);
    }

    /**
     * 用栈回溯
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
