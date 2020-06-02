package designPatterns.single;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:33
 */
//¿¡∫∫
public class Singleton02 {
    public static  Singleton02 singleton02=null;

    public static Singleton02 getInstance(){
        if (singleton02==null){
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
    private Singleton02(){

    }
}
