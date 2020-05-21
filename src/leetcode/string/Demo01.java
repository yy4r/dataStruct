package leetcode.string;

import javax.xml.stream.events.StartDocument;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 17:02
 */
//����һ���ַ����������ҳ����в������ظ��ַ���?��Ӵ�?�ĳ��ȡ�
//
//ʾ��?1:
//
//����: "abcabcbb"
//���: 3
//����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
public class Demo01 {
    public static void main(String[] args) {
        int asasagod = new Demo01().lengthOfLongestSubstring("abchisopg");
        System.out.println(asasagod);
    }
    //������ �� ˫ָ�뷨 ����ҪŪһ��
    //������
    public int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                boolean test = test(s, i, j);
                if (test){
                    maxCount = Math.max(j-i,maxCount);
                }
            }
        }

        return maxCount;
    }
    //�ж��Ƿ��ظ�
    public boolean test(String s, int start,int end ){
        Set<Character> set = new HashSet();
        for (int i =start;i<end;i++){
            if (set.contains(s.charAt(i))){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;

    }
}












