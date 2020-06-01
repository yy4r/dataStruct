package leetcode.test.test;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 9:42
 */
public class Demo01 {
    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        /* -XX:+UseParallelOldGC和-XX:+UseParallelGC结果一样，因为MXBean名字一样，但是实际使用的不一样 */
        List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : beans) {
            System.out.println(bean.getName());
        }



        System.out.println(Thread.currentThread().getName());
    }
}
