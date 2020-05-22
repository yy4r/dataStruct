package leetcode.array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/22 11:48
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        List list = new ArrayList();
        Arrays.sort(a);
        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
