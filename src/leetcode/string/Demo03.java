package leetcode.string;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 16:13
 */
//����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
//
//���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
//
//ȫ����ĸ���Ǵ�д������"USA"��
//������������ĸ�����Ǵ�д������"leetcode"��
//������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д��?����?"Google"��
//�������Ƕ����������û����ȷʹ�ô�д��ĸ��
public class Demo03 {
    public static void main(String[] args) {
//        System.out.println(Character.isUpperCase('A'));
        System.out.println(new Demo03().detectCapitalUse("HHllo"));
    }

    public boolean detectCapitalUse(String word) {
        //���ֻ��һ���ַ��Ļ�������true
        if (word.length()==1){
            return true;
        }
        //�����һ���Ǵ�д�Ļ� ��������������ж�
        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))){
                //�ڶ����Ǵ�д�������ȫ���Ǵ�д
                for (int i=2;i<word.length();i++){
                    if (!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }
            if (!Character.isUpperCase(word.charAt(1))){
                //�ڶ�����Сд�������ȫ����Сд
                for (int i=2;i<word.length();i++){
                    if (Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }



        //��һ����Сд����� ����ı���ȫ����Сд
        }else{
            for(int i=1;i<word.length();i++){
                if (Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
