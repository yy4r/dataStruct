package designPatterns.single.enumtest;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 20:00
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance() == User.getInstance());
    }
}
//½á¹ûÎªtrue
