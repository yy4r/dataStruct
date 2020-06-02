package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 9:32
 */
public class MyThread extends Thread
{
    public static void main(String[] args) {
        new MyThread().start();
        System.out.println("last");
    }


    public void run(){
        System.out.println("aaaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("nnn");
    }
}
