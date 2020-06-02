package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 13:48
 */
//守护线程 / 用户线程
public class DeamonThread {
    public static void main(String[] args) {
        people people = new people();
        god god = new god();
        Thread thread1 = new Thread(people);
        Thread thread2 = new Thread(god);
        //设置为守护线程
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}

class people implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第" + i + "天");
        }
        System.out.println("-----------");
    }
}

/**
 * 这里设置的 上帝 是永远不停止的 true 设置为守护线程之后，可以看到效果
 */
class god implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护守护");
        }
    }
}