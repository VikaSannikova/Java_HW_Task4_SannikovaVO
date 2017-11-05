package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void compare(){
         MyLinkedList<Integer> myList = new MyLinkedList<>();
         List<Integer> list = new LinkedList<>();
         int tmp = 0;
         for(int i = 0; i < 100; i++) {
             tmp = (int)(Math.random() * 100);
             list.add(tmp);
             myList.add(tmp);
         }

         long startTime = System.nanoTime();
         list.add(47, 9);
         long estimatedTime = System.nanoTime() - startTime;
         System.out.println("adding in LinkedList: " + estimatedTime);

         startTime = System.nanoTime();
         myList.add(47, 9);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("adding in MyLinkedList: " + estimatedTime);

         ///////////////////////////////////////////////////////////////

         startTime = System.nanoTime();
         list.get(47);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("get element from in LinkedList: " + estimatedTime);

         startTime = System.nanoTime();
         myList.get(47);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("get element from in MyLinkedList: " + estimatedTime);

         ///////////////////////////////////////////////////////////////

         startTime = System.nanoTime();
         list.indexOf(9);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("indexOf element in LinkedList: " + estimatedTime);

         startTime = System.nanoTime();
         myList.indexOf(9);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("indexOf element in MyLinkedList: " + estimatedTime);

         //////////////////////////////////////////////////////////////

         startTime = System.nanoTime();
         /*tmp = */list.remove(47);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("remove element from LinkedList: " + estimatedTime/*+ " tmp = " +tmp*/);

         startTime = System.nanoTime();
         /*tmp = */myList.remove(47);
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("remove element from MyLinkedList: " + estimatedTime/*+ " tmp = " +tmp*/);

         //////////////////////////////////////////////////////////////

         startTime = System.nanoTime();
         list.clear();
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("clear LinkedList: " + estimatedTime);

         startTime = System.nanoTime();
         myList.clear();
         estimatedTime = System.nanoTime() - startTime;
         System.out.println("clear MyLinkedList: " + estimatedTime);
     }

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

        list.clear();
        System.out.println("i'm not-->"+list.toString()+"<--here.");

        compare();
    }
}
