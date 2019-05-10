package cn.drew.容器和泛型.Demo4;

import java.util.LinkedList;

public class duilie {
    private LinkedList<Object> link;
    public duilie(){
        link = new LinkedList();
    }

    /**
     * void addFirst(E e)
     * 在该列表开头插入指定的元素。
     * @param obj
     */
    public void myAdd(Object obj){
        link.addFirst(obj);
    }

    /**
     * removeLast()
     * 从此列表中删除并返回最后一个元素。
     * @return
     */
    public Object myGet(){
        return  link.removeLast();
    }

    public boolean isNull(){
        return link.isEmpty();
    }

    public static void main(String[] args) {
        duilie dl = new duilie();
        dl.myAdd("1");
        dl.myAdd("10");
        dl.myAdd("100");
        dl.myAdd("1000");
        dl.myAdd("10000");

        System.out.println(dl.myGet());
        while (!dl.isNull()){
            System.out.println(dl.myGet());
        }
    }
}
