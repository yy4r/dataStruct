package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/11 10:29
 */
public class Q09 {
    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    // 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
    // 例如，数组?[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。??
    public static void main(String[] args) {
        int test[] = new int[]{3, 4, 5, 1, 2, 3};
        int test01[] = new int[]{ 1, 2, 3,4,5,6,7,8};
        Q09 q09 = new Q09();
//        int i = q09.minArray(test);
        int i1 = q09.binarySearch(test01, 8);
        System.out.println(test01[i1]);
    }

    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return 0;
    }

    public int minArrayAnswer(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }


    public int binarySearch(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i<=j){
            int mid = (i+j)/2;
            if (target==numbers[mid]){
                return mid;
            }
            if (target>numbers[mid]){
                i = mid+1;
            }
            if (target<numbers[mid]){
                j = mid-1;
            }
        }
        return 0;
    }
}
