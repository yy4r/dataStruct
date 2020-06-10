package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 16:21
 */
public class Q07 {
    public static void main(String[] args) {

    }

    //дһ������������ n ����쳲�������Fibonacci�����еĵ� n �쳲��������еĶ������£�
    //
    //F(0) = 0,? ?F(1)?= 1
    //F(N) = F(N - 1) + F(N - 2), ���� N > 1.
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    //����
    public int fib01(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }


    //��̬�滮 ʱ��o1  �ռ任ʱ��
    public int fib02(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; //״̬ת�ƴ�
            dp[i] = dp[i] % 1000000007;
        }
        return (int) dp[n];
    }

}
