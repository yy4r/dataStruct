package designPatterns.single;


/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:56
 */
//静态内部类方式
public class Singleton05 {
    public static class helper{
        public static Singleton05 singleton05 = new Singleton05();
    }
    public static final Singleton05 getInstance(){
        return helper.singleton05;
    }
    private Singleton05(){

    }
}
