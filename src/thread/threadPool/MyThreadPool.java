package thread.threadPool;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 10:25
 */
/*
自定义线程池
    成员变量：
        任务队列  需要考虑线程安全问题
        当前线程数量
        核心线程数量
        最大线程数量
        任务队列的长度
    成员方法
        提交任务
            将任务添加到集合中，判断任务是否超出任务总长度
        执行任务
            判断当前线程的数量，决定创建核心线程还是非核心线程
* */
public class MyThreadPool {
    //任务队列  线程安全
    private List<Runnable> tasks = Collections.synchronizedList(new LinkedList<>());
    //当前线程数量
    private int num;
    //核心线程数量
    private int corePoolSize;
    //最大线程数量
    private int maxSize;
    //任务队列的长度
    private int workSize;

}















