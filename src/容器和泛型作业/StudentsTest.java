package 容器和泛型作业;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentsTest implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
       int a1 = o1.getScore()-o2.getScore();
       int a2 = a1 == 0 ? o1.getName().compareTo(o2.getName()):a1;
    return  a2;
    }

    public static void main(String[] args) {
        //创建对象
        Set<Students> set = new TreeSet<Students>(new StudentsTest());
        //赋值和添加数据
        Students s1 = new Students(01,"张三",66);
        Students s2 = new Students(02,"张四",66);
        Students s3 = new Students(03,"张五",90);
        Students s4 = new Students(04,"张六",70);
        Students s5 = new Students(04,"张七",80);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        Iterator<Students> it = set.iterator();
        //打印
        while (it.hasNext()){
            Students students = it.next();
            System.out.println(students);
        }

    }
}
