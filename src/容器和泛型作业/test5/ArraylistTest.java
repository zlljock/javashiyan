package 容器和泛型作业.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<Student5> list = new ArrayList<>();
        list.add(new Student5(01,"李一",90));
        list.add(new Student5(06,"李er",80));
        list.add(new Student5(10,"李san",70));
        list.add(new Student5(04,"李si",99));

        Collections.sort(list);
        Iterator<Student5> it = list.iterator();
       it.forEachRemaining( System.out::println);

        System.out.println("******************************");
        list.sort(new StudentComparator());
        Iterator<Student5> it1 = list.iterator();
        it1.forEachRemaining(student5 -> System.out.println(student5));


    }


}
