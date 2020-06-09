package leetcode.sort;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/5 16:26
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 5, 67};
        InsertSort insertSort =  new InsertSort();
        insertSort.insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    public void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //将一个数字插入一个有序的数组中
            for (int j = i; j > 0; j--) {
                //和上一个元素比较值
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }
}
