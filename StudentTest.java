package Test5;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();


        Student s = new Student("张三",20);
        System.out.println("姓名："+s.getName());
        System.out.println("年龄："+s.getAge());

    }
}
