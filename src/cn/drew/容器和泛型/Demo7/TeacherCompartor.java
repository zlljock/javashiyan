package cn.drew.容器和泛型.Demo7;

import java.util.Comparator;

public class TeacherCompartor implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getAge()-o2.getAge();
    }
}
