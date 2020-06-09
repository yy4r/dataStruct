package leetcode.sort;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/5 16:04
 */
//ѡ��
public class SelectSort {
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] a = new int[]{1, 5, 2, 5, 67};
        selectSort.selectSort02(a);
        System.out.println(Arrays.toString(a));
    }

    public void selectSort02(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //����С�����±�
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                //�����򽻻�
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //����minIndex��i ��Ӧ��ֵ
            int tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tmp;
        }


    }


    public void selectSort(int[] a) {
        //��ʱ����
        int[] tmp = Arrays.copyOf(a, a.length);

        int length = a.length;
        int flag = 0;
        int b = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                //�ҳ���������С�ģ����һ������
                if (a[j] < a[flag]) {
                    flag = j;
                }
            }
            //����Ԫ��λ��
            b = a[i];
            a[i] = a[flag];
            a[flag] = b;
        }


    }
}
