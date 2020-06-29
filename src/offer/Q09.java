package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/11 10:29
 */
public class Q09 {
    //��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
    // ����һ����������������һ����ת�������ת�������СԪ�ء�
    // ���磬����?[3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ1��??
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
