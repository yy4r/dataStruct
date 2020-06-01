package leetcode.sort;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/27 18:13
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
//        int[] answer = mergeSort.helper(new int[]{1, 3,3, 5,7,8,9}, new int[]{2,3, 4, 6});
//        System.out.println(Arrays.toString(answer));
//        int[] ints = mergeSort.mergeHelper(new int[]{1, 3, 7, 2, 3, 8, 9}, 0, 3, 6);
//        System.out.println(Arrays.toString(ints));
        int [] test = new int[]{1, 3, 7, 2, 3, 8, 9};
        mergeSort.mergeSort(test,0,6);
        System.out.println(Arrays.toString(test));

    }
    public void mergeSort(int[] m,int start,int end){
        int mid = (end - start)/2;
        if (start<mid){
            //对左边排序
            mergeSort(m, start, mid);
            //对右边排序
            mergeSort(m, mid+1, end);
            //归并
            mergeHelper(m, start, mid, end);
        }
    }
    public int[] mergeHelper(int[] a,int start,int mid,int end){
        //将左边排序好的和右边排序好的合并
        int[] tmp = new int[end-start+1];
        //双指针
        int flag = 0;
        int i = start;
        int j = mid;
        while (i<mid&&j<=end){
            if (a[i]<a[j]){
                tmp[flag]=a[i];
                i++;
                flag++;
            }else{
                tmp[flag]=a[j];
                j++;
                flag++;
            }
        }
        while (i<mid){
            tmp[flag]=a[i];
            i++;
            flag++;
        }
        while (j<=end){
            tmp[flag]=a[j];
            j++;
            flag++;
        }
        flag = start;
        //完成之后 重新赋值
        for (int m = 0;m<tmp.length;m++){
            a[flag] = tmp[m];
            flag++;
        }
        return a;

    }



    //两个有序的数组排序合并
    public int[] helper(int[] a,int[]b){
        int[] answer = new int[a.length+b.length];
        //定义双指针
        int i = 0;
        int j = 0;
        int flag = 0;
        while (i<a.length&&j<b.length){
            if (a[i]<b[j]){
                answer[flag] = a[i];
                i++;
                flag++;
            }else {
                answer[flag] = b[j];
                j++;
                flag++;
            }
        }
        while (i<a.length){
            answer[flag] = a[i];
            i++;
            flag++;
        }
        while (j<b.length){
            answer[flag] = b[j];
            j++;
            flag++;
        }
        return answer;
    }
}
