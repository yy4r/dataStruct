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
        System.out.println("�߳�"+name+"����ִ������"+id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("�߳�"+name+"���������"+id);
    }
}
