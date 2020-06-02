package designPatterns.single;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 19:58
 */
public enum Singleton06 {
    INSTANCE;
    public Singleton06 getInstance(){
        return INSTANCE;
    }
}
