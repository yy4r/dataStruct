package offer;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 14:09
 */
//��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻��"%20"��
public class Q03 {
    public static void main(String[] args) {
        String test = "12345 6543";
        Q03 q03 = new Q03();
        String s = q03.replaceSpace(test);
        System.out.println(s);
    }

    public String replaceSpace(String s) {
        //�ռ任ʱ��
        char[] chars = s.toCharArray();
        char[] tmp = new char[s.length() * 3];
        int flag = 0;
        for (char aChar : chars) {
            if (aChar != ' ') {
                tmp[flag] = aChar;
                flag++;
            } else {
                tmp[flag] = '%';
                tmp[flag + 1] = '2';
                tmp[flag + 2] = '0';
                flag += 3;
            }
        }
        String m = new String(tmp,0,flag);
        return m;
    }
}
