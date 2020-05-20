package myData.recursive;

import java.util.Arrays;
/*
*
 * @Author Jack
 * @Description //T快排  冒泡
 * @Date 2020/5/20 2020/5/20
 * @Param
 * @return
 **/
public class TestQuickSort {
	static  int x=0;
	
	
	public static void main(String[] args) {
		int[] array = new int[] {3,2,4,5,7,1,8,0};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(x);
		System.out.println("-----------------");
		int[] array1 = new int[] {3,2,4,5,7,1,8,0};
		quickSort(array1,0,array1.length-1);
		System.out.println(Arrays.toString(array1));

	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				x++;
			}
		}
	}

	/**
	 * 快排
	 * @param array
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] array, int left, int right) {
	    if (left < right) {
	        int pivot = array[left];
	        int low = left;
	        int high = right;
	        while (low < high) {
	            while (low < high && array[high] >= pivot) {
	                high--;
	            }
	            array[low] = array[high];
	            while (low < high && array[low] <= pivot) {
	                low++;
	            }
	            array[high] = array[low];
	        }
	        array[low] = pivot;
	        quickSort(array, left, low - 1);
	        quickSort(array, low + 1, right);
	    }
	}

}
