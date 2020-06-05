package thread.threadPool;

import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 10:21
 */
public class MyWorker extends Thread {
    private String name;//保存线程的名字
    private List<Runnable> tasks;

    public MyWorker(String name, List<Runnable> tasks) {
        super(name);
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (tasks.size()>0){
            Runnable r = tasks.remove(0);
            r.run();
        }
    }
}
