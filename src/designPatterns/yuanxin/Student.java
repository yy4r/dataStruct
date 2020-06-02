package designPatterns.yuanxin;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 20:01
 */


public class Student implements Cloneable{
    int age;
    String name;
    Student student;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = null;

        //浅克隆方式
        student = (Student) super.clone();
        //这里是深度克隆 不过由于不知道对象的字段有多少 没扩展性
        //深度克隆最常见的还是序列化反序列化
        Student clone = (Student) this.student.clone();
        student.setStudent(clone);
        return student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
