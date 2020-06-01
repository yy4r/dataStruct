package leetcode.chengxuyuan;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 15:06
 */
public class Demo01 {
    public static void main(String[] args) {
        boolean agdsgh = new Demo01().isUnique("agdsyth");
        System.out.println(agdsgh);
    }
    //判断字符串是不是都是不同的
    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        for (int i=0;i<chars.length;i++){
            for (int j=i+1;j<chars.length;j++){
                if (chars[j]==chars[i]){
                    return false;
                }
            }
        }


        return true;
    }
}
