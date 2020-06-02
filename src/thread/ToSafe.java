package thread;

import leetcode.annotation.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:27
 */
public class ToSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
//        List list = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            new Thread(() -> {
//                synchronized (Test.class) {
                    list.add(Thread.currentThread().getName());
//                }
            }).start();
        }
        try {
            //主线程可能直接执行到后面  避免测试结果不准确  线程休眠三秒钟
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }

}
