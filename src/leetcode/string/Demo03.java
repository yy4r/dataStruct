package leetcode.string;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/21 16:13
 */
//给定一个单词，你需要判断单词的大写使用是否正确。
//
//我们定义，在以下情况时，单词的大写用法是正确的：
//
//全部字母都是大写，比如"USA"。
//单词中所有字母都不是大写，比如"leetcode"。
//如果单词不只含有一个字母，只有首字母大写，?比如?"Google"。
//否则，我们定义这个单词没有正确使用大写字母。
public class Demo03 {
    public static void main(String[] args) {
//        System.out.println(Character.isUpperCase('A'));
        System.out.println(new Demo03().detectCapitalUse("HHllo"));
    }

    public boolean detectCapitalUse(String word) {
        //如果只有一个字符的话，返回true
        if (word.length()==1){
            return true;
        }
        //如果第一个是大写的话 后续有两种情况判断
        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))){
                //第二个是大写，则后面全部是大写
                for (int i=2;i<word.length();i++){
                    if (!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }
            if (!Character.isUpperCase(word.charAt(1))){
                //第二个是小写，则后面全部是小写
                for (int i=2;i<word.length();i++){
                    if (Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }



        //第一个是小写的情况 后面的必须全部是小写
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
