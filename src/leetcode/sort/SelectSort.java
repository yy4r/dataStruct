package leetcode.sort;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/5 16:04
 */
//选择
public class SelectSort {
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] a = new int[]{1, 5, 2, 5, 67};
        selectSort.selectSort02(a);
        System.out.println(Arrays.toString(a));
    }

    public void selectSort02(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //存最小数的下标
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                //不是则交换
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //交换minIndex和i 对应的值
            int tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tmp;
        }


    }


    public void selectSort(int[] a) {
        //临时数组
        int[] tmp = Arrays.copyOf(a, a.length);

        int length = a.length;
        int flag = 0;
        int b = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                //找出数组中最小的，与第一个交换
                if (a[j] < a[flag]) {
                    flag = j;
                }
            }
            //交换元素位置
            b = a[i];
            a[i] = a[flag];
            a[flag] = b;
        }


    }
}
