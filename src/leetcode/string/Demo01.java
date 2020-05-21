package leetcode.string;

import javax.xml.stream.events.StartDocument;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 17:02
 */
//给定一个字符串，请你找出其中不含有重复字符的?最长子串?的长度。
//
//示例?1:
//
//输入: "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
public class Demo01 {
    public static void main(String[] args) {
        int asasagod = new Demo01().lengthOfLongestSubstring("abchisopg");
        System.out.println(asasagod);
    }
    //暴力法 和 双指针法 都需要弄一下
    //暴力法
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
    //判断是否不重复
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












