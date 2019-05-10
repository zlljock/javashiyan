package cn.drew.容器和泛型.Demo7;

import java.util.Comparator;

public class Mytool {
    public static <T extends Comparable>void sort(T[] array){
        for (int i = 0; i < array.length; i++)
            for (int j=i+1;j<array.length;j++)
            if (array[i].compareTo(array[j])<0){
                T tmp = array[i];
                array[i]=array[j];
                array[j] = tmp;
            }

    }

    public  static  <T>void sort(T[] array, Comparator<T>comparator){

    }
}
