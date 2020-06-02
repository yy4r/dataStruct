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
        //创建执行者
        ExecutorService executorService = Executors.newCachedThreadPool();
        //执行
        Future submit = executorService.submit(myThread03);
        //获取返回值
        Object o = submit.get();
        System.out.println(o.toString());
        //关闭
        executorService.shutdown();
    }

    @Override
    public Object call() throws Exception {
        String s = "hello";
        return s;
    }
}
