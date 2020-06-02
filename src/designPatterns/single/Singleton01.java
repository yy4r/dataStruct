package designPatterns.single;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:30
 */
//ถ๖บบ
public class Singleton01 {
    public static Singleton01 singleton01 = new Singleton01();

    public static Singleton01 getInstance(){
        return singleton01;
    }
    private Singleton01(){

    }
}
