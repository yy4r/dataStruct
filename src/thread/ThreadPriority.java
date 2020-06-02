package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 13:42
 */
//线程的优先级
    //最终还是要看 cpu的分片    优先级 只仅仅代表权重
public class ThreadPriority implements Runnable{
    public static void main(String[] args) {
        ThreadPriority threadPriority1 = new ThreadPriority();
        ThreadPriority threadPriority2 = new ThreadPriority();
        ThreadPriority threadPriority3 = new ThreadPriority();
        ThreadPriority threadPriority4 = new ThreadPriority();
        ThreadPriority threadPriority5 = new ThreadPriority();
        Thread thread1 = new Thread(threadPriority1);
        Thread thread2 = new Thread(threadPriority2);
        Thread thread3 = new Thread(threadPriority3);
        Thread thread4 = new Thread(threadPriority4);
        Thread thread5 = new Thread(threadPriority5);
            thread1.setPriority(1);
            thread2.setPriority(2);
            thread3.setPriority(3);
            thread4.setPriority(4);
            thread5.setPriority(5);
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().getPriority());
    }
}
