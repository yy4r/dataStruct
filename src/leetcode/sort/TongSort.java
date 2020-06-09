package leetcode.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/5 16:54
 */
//���Ԫ�أ��ֱ��� 0 1 2 3 4
public class TongSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,2,3,0,4,5,3,5,7,6,9};
        TongSort tongSort = new TongSort();
        List sort = tongSort.sort(a);
        System.out.println(sort.toString());

    }

    public List sort(int a[]) {
        List list = new ArrayList();
        int[] tmp = new int[a.length];
        //ȫ���Ž�Ͱ��
        for (int i = 0; i < a.length; i++) {
            tmp[a[i]]++;
        }
        for (int i = 0; i < tmp.length; i++) {
            //һ��һ��ȡ����
            while (tmp[i]!=0){
                list.add(i);
                tmp[i]--;
            }
        }
        return list;
    }
}
