package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 16:37
 */
public class Q08 {
    public static void main(String[] args) {

    }
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n?级的台阶总共有多少种跳法。
    //
    //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

    public int numWays(int n) {
        //可能从n-1的可能 加上从n-2的可能跳上来
        if (n == 1 || n == 2) {
            return n;
        }
        return numWays(n - 1) + numWays(n - 2);
    }

    public int numWays01(int n) {
        //迭代
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
    //动规
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

    //动规
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
