package cn.drew.容器和泛型.Demo4;

/*使用LinkedList分别实现队列、
        堆栈(自定义队列、堆栈类，封装LinkedList类)。*/
import java.util.LinkedList;
public class LinkedListDemo {
        private LinkedList linkedList=new LinkedList();
        //进栈
        public void  push(Object value)
        {
            linkedList.addFirst(value);
        }
        //出栈
        public Object pop(){//弹
            Object value=linkedList.getFirst();
            linkedList.removeFirst();
            return value;
        }
        //容器大小
        public int size(){
            return linkedList.size();
        }
        public static void main(String[] args) {
            LinkedListDemo lld = new LinkedListDemo();
            lld.push("1");
            lld.push("2");
            lld.push("3");
            lld.push("4");
            lld.push("5");

            while(lld.size()!=0){
                System.out.println(lld.pop());
            }

        }
    }






