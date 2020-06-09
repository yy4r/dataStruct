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
            //��һ�����ֲ���һ�������������
            for (int j = i; j > 0; j--) {
                //����һ��Ԫ�رȽ�ֵ
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }
}
