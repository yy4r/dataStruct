package offer.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 13:50
 */
public class T01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        boolean add = set.add(1);
        boolean add1 = set.add(1);
        System.out.println(add1);
    }
}
