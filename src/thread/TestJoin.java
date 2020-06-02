package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 13:32
 */
//²å¶Ó
public class TestJoin implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        for (int i=1;i<100;i++){
            System.out.println(thread.getState());
            if (i==50){
                thread.join();
            }
            System.out.println("main"+i);
        }
    }

    @Override
    public void run() {
        for (int i =0;i<100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("²å¶ÓÖ´ÐÐ");
        }
    }
}
