package leetcode.chengxuyuan;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 15:27
 */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        String a_bsng_sog_sd = demo03.replaceSpaces("a bsng sog sd", 13);
        System.out.println(a_bsng_sog_sd);
    }
    //Ìæ»»¿Õ¸ñÎª %20s
    public String replaceSpaces(String s, int length) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<length;i++){
            if (s.charAt(i)==' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }





}
