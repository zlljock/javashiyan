package 容器和泛型作业.test5;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student5> {


    @Override
    public int compare(Student5 o1, Student5 o2) {
        return o1.getSno()-o2.getSno();
    }
}
