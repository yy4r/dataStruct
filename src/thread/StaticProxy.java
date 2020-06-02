package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 10:45
 */
public class StaticProxy {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("aa")).start();
    }
}
