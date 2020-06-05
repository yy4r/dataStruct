package thread.threadPool;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 10:19
 */
public class MyTask implements Runnable {
    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
    String name =  Thread.currentThread().getName();
        System.out.println("线程"+name+"即将执行任务："+id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+name+"完成了任务："+id);
    }
}
