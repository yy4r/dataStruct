package designPatterns.single;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:35
 */
//线程安全的懒汉
public class Singleton03 {
    public static  Singleton03 singleton03=null;

    public static synchronized Singleton03 getInstance(){
        if (singleton03==null){
            singleton03 = new Singleton03();
        }
        return singleton03;
    }
    private Singleton03(){

    }

}
