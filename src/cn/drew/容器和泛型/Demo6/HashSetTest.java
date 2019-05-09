package cn.drew.容器和泛型.Demo6;



import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    private static void hashSet() {
        Cat c1 = new Cat("tom",3,30);
        Cat c2 = new Cat("tom2",7,15);
        Cat c3 = new Cat("tom12",5,4);
        Cat c4 = new Cat("tom8",1,2);
        Cat c5 = new Cat("tom",3,30);
        Set<Cat> cats =new HashSet<>();
        cats .add(c1);
        cats .add(c2);
        cats .add(c3);
        cats .add(c4);
        cats.add(c1);//会覆盖掉上面的c1
        cats.add(c5);
        System.out.println(cats.size());//而且打印出来的长度还是4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("c1="+c1.hashCode());
        System.out.println("c2="+c2.hashCode());
        System.out.println("c5="+c5.hashCode());
       //c1和c5的hashCode值相同，如果两个对象的hashcode
        // 相同，不一定是同一个对象，如果不同，那一定不是同一个对象

    }


    public static void main(String[] args) {
     hashSet();

    }
}
