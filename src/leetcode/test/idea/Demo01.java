package leetcode.test.idea;

import leetcode.test.hash.Student;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/29 13:44
 */
public class Demo01 implements Runnable{
     volatile int i=1;
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        Demo01 demo02 = new Demo01();
        Demo01 demo03 = new Demo01();
        while (true){
            demo01.run();
            demo02.run();
            demo03.run();
        }
    }

    @Override
    public synchronized void run() {
        i++;
        System.out.println(i);
    }
}
