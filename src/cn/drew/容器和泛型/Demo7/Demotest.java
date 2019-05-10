package cn.drew.容器和泛型.Demo7;

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
}
