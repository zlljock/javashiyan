package cn.drew.容器和泛型.Demo6;



import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    private static void hashSet() {


        Cat c1 = new Cat("tom",3,30);
        Cat c2 = new Cat("tom2",7,15);
        Cat c3 = new Cat("tom12",5,4);
        Cat c4 = new Cat("tom8",1,2);

        Set<Cat> cats =new HashSet<>();
        cats .add(c1);
        cats .add(c2);
        cats .add(c3);
        cats .add(c4);
        cats.add(c1);
        System.out.println(cats.size());
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }


    public static void main(String[] args) {
     hashSet();

    }
}
