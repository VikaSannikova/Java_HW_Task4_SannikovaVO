package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        int value = 0;
        list.add(1);
        //System.out.println(list.toString());
        list.add(12);
        list.add(17);
        System.out.println(list.toString());
        list.add(0,33);
        list.add(2,0);
        list.add(0,331);
        list.add(6,555);
        //list.add(10,10);
        System.out.println(list.toString());
        //System.out.println(list.toArray());
        System.out.println(Arrays.toString(list.toArray()));
        value = list.remove(2);
        System.out.println(value);
        System.out.println(list.toString());
        value = list.remove(0);
        System.out.println("we remove "+value);
        System.out.println(list.toString());

        System.out.println("indexOf(0) = " + list.indexOf(0));
        int pos = list.indexOf(555);
        System.out.println("indexOf(555) = " + list.indexOf(555));

        System.out.println(list.toString());
        System.out.println("get(2) = " + list.get(2));
        list.set(2, 25);
        System.out.println(list.toString());
        System.out.println("get(2) = " + list.get(2));

    }
}
