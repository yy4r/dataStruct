package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 15:28
 */
public class TestPool implements Runnable{
    public static void main(String[] args) {
        //创建一个线程池子
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //执行线程方法
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        //不关闭的话 程序不会停止
        executorService.shutdown();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
