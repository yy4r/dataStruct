package leetcode.test.hash;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/29 13:24
 */
public class MyTest01 {
    public static void main(String[] args) throws InterruptedException {
        Student student01 = new Student();
        Student student02 = new Student();
        Teacher teacher02 = new Teacher();
        Teacher teacher01 = new Teacher();
        student01.setTeacher(teacher01);
        student02.setTeacher(teacher02);
        student01.setAge(1);
        student02.setAge(1);
        student01.getTeacher().setAge(1);
        student02.getTeacher().setAge(1);
//        System.out.println(student01.equals(student02));
        Thread.sleep(1000);
        System.out.println("  ".hashCode());
        System.out.println("good".hashCode());


   /*     System.out.println(student01);
        System.out.println(student02);
        int i = student01.hashCode();
        System.out.println(i);*/
    }
}
