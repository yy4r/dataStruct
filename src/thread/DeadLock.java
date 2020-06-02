package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:44
 */
//ģ���������
public class DeadLock {


    public static void main(String[] args) {
            MakeUp makeUp0 = new MakeUp(0);
            MakeUp makeUp1 = new MakeUp(1);
            makeUp0.start();
            makeUp1.start();
    }
}

class MakeUp extends Thread {
    //��Ҫnew��ζ���
    //��֤ ����ֻ��һ��
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
                System.out.println("��ȡ��a");
                Thread.sleep(1000);
                synchronized (b) {
                    System.out.println("��ȡ��b");
                }
            }
        } else {
            synchronized (b) {
                System.out.println("��ȡ��b");
                Thread.sleep(1000);
                synchronized (a) {
                    System.out.println("��ȡ��a");
                }
            }
        }
    }


}

class A {

}

class B {

}
