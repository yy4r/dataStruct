package leetcode.chengxuyuan;

import java.util.Arrays;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 15:14
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println('a'^'a');


        System.out.println(new Demo02().CheckPermutation("abd","cba"));
    }

    //两个字符串重拍之后 可以相等  错误解答
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] s01 = s1.toCharArray();
        char[] s02 = s2.toCharArray();
        int sum = s01[0]^s02[0];
        for(int i=1;i<s01.length;i++){
            sum=sum^s01[i]^s02[i];
        }
        if (sum!=0){
            return false;
        }
        return true;
    }


    public boolean CheckPermutation01(String s1, String s2) {
        char[] s01 = s1.toCharArray();
        char[] s02 = s2.toCharArray();
        Arrays.sort(s01);
        Arrays.sort(s02);
        String s = s01.toString();
        String s3 = s02.toString();
        return s.equals(s3);
    }

}
