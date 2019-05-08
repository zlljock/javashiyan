package 容器和泛型作业;

import java.util.Objects;

public class Students {
    private int sno;
    private String name;
    private int score;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sno == students.sno &&
                Double.compare(students.score, score) == 0 &&
                name.equals(students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, score);
    }

    public Students(int sno, String name, int score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
