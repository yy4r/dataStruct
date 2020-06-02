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

        //ǳ��¡��ʽ
        student = (Student) super.clone();
        //��������ȿ�¡ �������ڲ�֪��������ֶ��ж��� û��չ��
        //��ȿ�¡����Ļ������л������л�
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
