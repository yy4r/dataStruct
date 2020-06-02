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
        //����һ���̳߳���
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //ִ���̷߳���
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        executorService.execute(new TestPool());
        //���رյĻ� ���򲻻�ֹͣ
        executorService.shutdown();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
