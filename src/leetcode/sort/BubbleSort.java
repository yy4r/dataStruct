package leetcode.sort;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 17:04
 */
//ð��
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int test [] = new int[]{5,1,3,6,7,3,4,2};
        bubbleSort.bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }

    public void bubbleSort(int[] a) {
        int tmp;
        int length = a.length;
        int flag = length;
        //ѭ��n��
        for (int i = 0;i<length;i++){
            for (int j = 0;j<flag-1;j++){
                //С�ھͽ���
                if (a[j]>a[j+1]){
                     tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            flag--;
        }
    }
}
