package leetcode.array;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 16:22
 */
//����һ����������?A��ֻ�п��Խ��仮��Ϊ��������ȵķǿղ���ʱ�ŷ���?true�����򷵻� false��
//
//��ʽ�ϣ���������ҳ�����?i+1 < j?������?(A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])?�Ϳ��Խ��������ȷ֡�
//
public class Demo001 {
    public static void main(String[] args) {

    }
    public boolean canThreePartsEqualSum(int[] A) {
        int count = 0;
        for (int i : A) {
            count = count + i;
        }
        if (count%3!=0){
            return false;
        }
        count = count/3;
        //�����ּ�������Ҫ����count
        int sum01 = A[0];
        int sum02 = A[A.length-1];
        int i = 0;
        int j = A.length;
        while (i+1<j){
          if (sum01==sum02&&sum02==count){
              return true;
          }
          if (sum01!=count){
              i++;
              sum01 = A[i];
          }
          if (sum02!=count){
              j--;
              sum02 = A[j];
          }

        }
//        for (int i = 0;i<A.length;i++){
//            sum = sum+i;
//            if(sum==count){
//                return true;
//            }
//        }
        return false;
    }
}
