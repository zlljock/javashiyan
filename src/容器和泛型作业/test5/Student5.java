package 容器和泛型作业.test5;

import 容器和泛型作业.tes2.Student;

import java.util.Comparator;
import java.util.Objects;

public class Student5 implements Comparable<Student5> {
    private int sno;
    private String name;
    private int score;

    public int getSno() {
        return sno;
    }

    public void setSno(int son) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student5(int son, String name, int score) {
        this.sno = son;
        this.name = name;
        this.score = score;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student5 student5 = (Student5) o;
        return sno == student5.sno &&
                score == student5.score &&
                Objects.equals(name, student5.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, score);
    }

    @Override
    public String toString() {
        return "Student5{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student5 o) {
        Student5 s5 = (Student5)o;
        return this.score - s5.getScore();
    }

/*

    public int compareTo(Object o) {
        if (o instanceof Student5) {
            Student5 s5 = (Student5) o;
            return this.score - s5.getScore();
        }
        throw new ClassCastException("不能转换为Emp类型的对象...");


*/


        }

