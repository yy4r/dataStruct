package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 10:21
 */
public class Demo01 implements Runnable{
    public  int ticket = 10;

    public static void main(String[] args) {
        Demo01 xiaoming = new Demo01();
        Demo01 xiaohong = new Demo01();
        Demo01 huangniu = new Demo01();
        new Thread(xiaoming,"С��").start();
        new Thread(xiaohong,"С��").start();
        new Thread(huangniu,"��ţ").start();

    }
    @Override
    public void run() {

        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"������"+ticket--+"Ʊ");
        }
    }
}
