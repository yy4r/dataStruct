package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 13:21
 */
//œﬂ≥Ã¿Ò»√
public class TestYield implements Runnable{

    public static void main(String[] args) {
        TestYield testYield = new TestYield();
        Thread thread = new Thread(testYield);
        thread.start();
    }
    @Override
    public void run() {
        Thread.yield();
        System.out.println("hhh");
    }
}
