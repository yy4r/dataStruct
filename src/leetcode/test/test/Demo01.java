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
        /* -XX:+UseParallelOldGC��-XX:+UseParallelGC���һ������ΪMXBean����һ��������ʵ��ʹ�õĲ�һ�� */
        List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : beans) {
            System.out.println(bean.getName());
        }



        System.out.println(Thread.currentThread().getName());
    }
}
