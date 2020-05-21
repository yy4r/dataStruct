package leetcode.array;

import java.sql.SQLOutput;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 15:59
 */    //�ڸ����б��У��� i �׸����ĳ���ʱ��Ϊ time[i] �롣
//
//�������ܳ���ʱ�䣨����Ϊ��λ���ɱ� 60 �����ĸ����Ե���������ʽ�ϣ�����ϣ������������ i �� j ����? i < j ����?(time[i] + time[j]) % 60 == 0��
//ʾ�� 1��
//
//���룺[30,20,150,100,40]
//�����3
//���ͣ������Ե��ܳ���ʱ��ɱ� 60 ������
//(time[0] = 30, time[2] = 150): �ܳ���ʱ�� 180
//(time[1] = 20, time[3] = 100): �ܳ���ʱ�� 120
//(time[1] = 20, time[4] = 40): �ܳ���ʱ�� 60
//ʾ�� 2��
//
//���룺[60,60,60]
//�����3
//���ͣ��������Ե��ܳ���ʱ�䶼�� 120�����Ա� 60 ������

public class Demo {
    public static void main(String[] args) {
        int i = new Demo().numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        System.out.println(i);
        System.out.println(50%60);
    }
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        //ÿһ�ԵĿ����� ȫ�����
        for (int i = 0;i<time.length;i++){
            for (int j=i+1;j<time.length;j++){
                if ((time[i]+time[j])%60==0){
                    count++;
                }
            }
        }
        return count;
    }
}
