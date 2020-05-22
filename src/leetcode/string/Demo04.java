package leetcode.string;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 20:04
 */
//����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
/*    ʾ�� 1:

            ����: 123
            ���: 321
            ʾ�� 2:

            ����: -123
            ���: -321
            ʾ�� 3:

            ����: 120
            ���: 21*/
public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        int reverse = demo04.reverse(1200432);
        System.out.println(reverse);
    }
    public int reverse(int x) {
        int target=0;
        boolean flag = false;
        String a = ((Integer)x).toString();
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder = stringBuilder.reverse();
        int end = -1;
        for (int i =0;i<a.length();i++){
            if (a.charAt(i)!=0){
                flag=true;
            }
            if (flag==true){
                if (end!=-1){
                    stringBuilder.delete(0,end);
                }
                return Integer.parseInt(stringBuilder.toString());
            }
            if (a.charAt(i)==0){
                end = i;
            }
        }
        return target;
//        char[] target = new char[a.length()];
//        for (int i=a.length()-1;i>0;i--){
//            a.charAt(i);
//        }
    }
}
