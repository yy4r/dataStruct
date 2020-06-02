package designPatterns.single;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:38
 */
//双重锁
public class Singleton04 {
    //可见性
    public static volatile Singleton04 singleton04;

    public static Singleton04 getInstance() {
        if (singleton04 == null) {
            synchronized (Singleton04.class) {
                if (singleton04 == null) {
                    singleton04 = new Singleton04();
                }
            }
        }
        return singleton04;
    }

    private Singleton04() {

    }
}
