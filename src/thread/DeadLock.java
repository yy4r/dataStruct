package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:44
 */
//模拟死锁情况
public class DeadLock {


    public static void main(String[] args) {
            MakeUp makeUp0 = new MakeUp(0);
            MakeUp makeUp1 = new MakeUp(1);
            makeUp0.start();
            makeUp1.start();
    }
}

class MakeUp extends Thread {
    //需要new多次对象
    //保证 对象只有一个
    static A a = new A();
    static B b = new B();
    public int choose;
    public MakeUp(int choose){
        this.choose=choose;
    }

    @Override
    public void run() {
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void makeUp() throws InterruptedException {
        if (choose == 0) {
            synchronized (a) {
                System.out.println("获取了a");
                Thread.sleep(1000);
                synchronized (b) {
                    System.out.println("获取了b");
                }
            }
        } else {
            synchronized (b) {
                System.out.println("获取了b");
                Thread.sleep(1000);
                synchronized (a) {
                    System.out.println("获取了a");
                }
            }
        }
    }


}

class A {

}

class B {

}
