package lambda;

import java.util.function.Consumer;

public class Appletest {
    public static void ConsumerApple(Apple[]apples, Consumer<Apple> consumer){
        for (Apple apple : apples) {
            consumer.accept(apple);
        }
    }
    public static void main(String[] args) {
        Apple[] apples = new Apple[]{new Apple("red",5),
                new Apple("blue",10),new Apple("yellow",14)};
        //使用lambda表达式
        ConsumerApple(apples,(apple -> System.out.println(apple)));
        //使用内部类
        System.out.println("====================");
        ConsumerApple(apples, new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        });

    }
}
