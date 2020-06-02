package thread;

import java.util.concurrent.*;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 10:41
 */
public class MyThread03 implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread03 myThread03 = new MyThread03();
        //����ִ����
        ExecutorService executorService = Executors.newCachedThreadPool();
        //ִ��
        Future submit = executorService.submit(myThread03);
        //��ȡ����ֵ
        Object o = submit.get();
        System.out.println(o.toString());
        //�ر�
        executorService.shutdown();
    }

    @Override
    public Object call() throws Exception {
        String s = "hello";
        return s;
    }
}
