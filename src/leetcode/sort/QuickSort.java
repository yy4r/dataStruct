package leetcode.sort;

import myData.array.TestMyArray;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/27 18:11
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 5, 1, 3,8,7};
//        new QuickSort().quickSort(a);

        QuickSort quickSort = new QuickSort();
        quickSort01(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort01(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp���ǻ�׼λ
        temp = arr[low];

        while (i<j) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //������������򽻻�
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
        arr[low] = arr[i];
        arr[i] = temp;
        //�ݹ�����������
        quickSort01(arr, low, j-1);
        //�ݹ�����Ұ�����
        quickSort01(arr, j+1, high);
    }

    public void quickSort(int[] a, int start, int end) {
        if (start<end){
            //����˫ָ��
            //�����׼��
            int flag = a[start];
            int m = start;
            int n = end;
            while (m<n){
                while (m<n&&a[n]>=flag){
                    n--;
                }
                while (m<n&&a[m]<=flag){
                    m++;
                }
                //����֮�����
                if (m<n){
                    int tmp = a[m];
                    a[m] = a[n];
                    a[n] = tmp;
                }
            }
            a[start] = a[m];
            a[m] = flag;
            quickSort(a,start,m-1);
            quickSort(a, m+1, end);
        }
    }

}
