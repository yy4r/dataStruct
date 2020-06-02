package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:20
 */
//模拟线程不安全情况
public class Unsafe {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i=1;i<=10000;i++){
          new Thread(()->{
                  list.add(Thread.currentThread().getName());
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
