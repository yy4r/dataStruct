package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:05
 */
public class SyncThread {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread01 = new Thread(ticket, "thread01");
        Thread thread02 = new Thread(ticket, "thread02");
        Thread thread03 = new Thread(ticket, "thread03");
        Thread thread04 = new Thread(ticket, "thread04");
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
    }
}

class Ticket implements Runnable {
    //用ReentrantLock
    private Lock lock = new ReentrantLock();

    private int ticket = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }

    private void buy() {
        lock.lock();
        try {
            if (ticket <= 0) {
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("购买到了第" + ticket-- + "票");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
