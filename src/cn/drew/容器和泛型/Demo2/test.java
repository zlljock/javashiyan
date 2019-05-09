package cn.drew.容器和泛型.Demo2;

import java.util.HashMap;
import java.util.Map;
/*2.每一个学生都有对应的归属地。??学生Student，地址String。
        ??学生属性：姓名，年龄。?注意：姓名和年龄相同的视为同一个学生。
        ?保证学生的唯一性。定义map容器，将学生作为键，地址作为值存入map。
        分别使用keySet与entrySet遍历map中元素*/
public class test {
    public static void main(String[] args) {
        Map<Dog,String> map = new HashMap<>();
        map.put(new Dog("旺财",43),"福州");
        map.put(new Dog("旺财二",5),"德州");
        map.put(new Dog("旺财仨",12),"贵州");


        for (Dog dog : map.keySet()) {
            System.out.println(dog+"--地址:"+map.get(dog));
        }


        System.out.println("===============");
        for (Map.Entry<Dog, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"--地址"+entry.getValue());
        }
    }
}
