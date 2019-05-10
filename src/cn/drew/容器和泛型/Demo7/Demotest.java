package cn.drew.容器和泛型.Demo7;

import org.junit.Test;

public class Demotest {
    public static void main(String[] args) {
        System.out.println("使用自然排序，年龄降序");
        Student[] students = {new Student("a",15),
                new Student("b",16),new Student("c",13)};
        Mytool.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
@Test
public void teachertest(){
    System.out.println("使用比较排序，年龄降序");
    Teacher[] teachers = {new Teacher("q",40),
            new Teacher("w",60),new Teacher("E",99),
            new Teacher("t",23)};
    Mytool.sort(teachers,new TeacherCompartor());
    for (Teacher teacher : teachers) {
        System.out.println(teacher);
    }
}
}
