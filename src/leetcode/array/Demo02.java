package leetcode.array;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 16:47
 */
//���ʹ��ϵİ��������� D ���ڴ�һ���ۿ����͵���һ���ۿڡ�
//
//���ʹ��ϵĵ� i?������������Ϊ?weights[i]��ÿһ�죬���Ƕ��ᰴ����������˳�������ʹ���װ�ذ���������װ�ص��������ᳬ�������������������
//
//�������� D ���ڽ����ʹ��ϵ����а����ʹ�Ĵ����������������

public class Demo02 {
    public static void main(String[] args) {

    }
    public int shipWithinDays(int[] weights, int D) {
        int count = 1;
        int mindate = 1;

        while (mindate==D){
             count++;
             mindate = mindate(weights, count);
        }
        return count;
    }
    /**
     * D�����������صĻ�  �·��߼�����
     * @param weights
     * @param
     * @return
     */
    public int mindate(int[] weights, int max_weight) {
        int count = 1;
        int weight = weights[0];
        //̰��
        for (int i = 1; i < weights.length; i++) {
            weight = weight+weights[i];
            if (weight>max_weight){
                i--;
                weight=0;
                count++;
            }
        }

        return count;
    }
}
