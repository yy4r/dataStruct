package leetcode.annotation;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/25 19:25
 */
public class Test {
    @My(value = "уехЩ")
    public String name;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.name);
    }
}
