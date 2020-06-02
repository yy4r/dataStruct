package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 10:02
 */
public class MyThread02 implements Runnable{
    public static void main(String[] args) {
        System.out.println("aaa");
        MyThread02 myThread02 = new MyThread02();
        new Thread(myThread02).start();
        System.out.println("aaa");
    }

    @Override
    public void run() {
        System.out.println("hello world");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
