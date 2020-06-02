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
        new Thread(xiaoming,"小明").start();
        new Thread(xiaohong,"小红").start();
        new Thread(huangniu,"黄牛").start();

    }
    @Override
    public void run() {

        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"抢到了"+ticket--+"票");
        }
    }
}
