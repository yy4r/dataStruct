package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 16:37
 */
public class Q08 {
    public static void main(String[] args) {

    }
    //һֻ����һ�ο�������1��̨�ף�Ҳ��������2��̨�ס������������һ�� n?����̨���ܹ��ж�����������
    //
    //����Ҫȡģ 1e9+7��1000000007����������ʼ���Ϊ��1000000008���뷵�� 1��

    public int numWays(int n) {
        //���ܴ�n-1�Ŀ��� ���ϴ�n-2�Ŀ���������
        if (n == 1 || n == 2) {
            return n;
        }
        return numWays(n - 1) + numWays(n - 2);
    }

    public int numWays01(int n) {
        //����
        int a = 1;
        int b = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
    //����
    public int num(int n){
        int [] tmp= new int[n+1];
        tmp[0] = 0;
        tmp[1] = 1;
        tmp[2] = 2;
        for (int i=3;i<=n;i++){
            tmp[i] = tmp[i-1]+tmp[i-2];
        }
        return tmp[n];
    }

    //����
    public int num01(int n){
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) ;
            a = b;
            b = sum;
        }
        return a;
    }


}
