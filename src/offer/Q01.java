package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 13:43
 */
//�ҳ��������ظ������֡�
//
//
//��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
public class Q01 {
    public static void main(String[] args) {
        Q01 q01 = new Q01();
        int[] test = new int[]{1, 2, 3, 1, 5};
        int repeatNumber = q01.findRepeatNumber(test);
        System.out.println(repeatNumber);
    }

    public int findRepeatNumber(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (tmp[nums[i]] > 0) {
                return nums[i];
            }
            tmp[nums[i]]++;
        }
        return -1;
    }
}
