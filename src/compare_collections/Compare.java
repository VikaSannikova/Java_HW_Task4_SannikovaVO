package compare_collections;

import javax.swing.*;
import java.util.*;

public class Compare
{
    public static void compareLists(List<Integer>list){
        int tmp = 0;
        for(int i = 0; i < 10000; i++) {
            tmp = (int)Math.random()*100;
            list.add(tmp);
        }

        long startTime = System.nanoTime();
        list.add(47, 9);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in "+list.getClass().getName()+": " + estimatedTime);

        ////////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        list.get(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("getting element from "+list.getClass().getName()+": " + estimatedTime);

        ///////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        list.indexOf(9);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("indexOf element from "+list.getClass().getName()+": " + estimatedTime);

        ///////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        list.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from "+list.getClass().getName()+": " + estimatedTime);
    }

    public static void compareSets(Set<Integer>set){
        int tmp = 0;
        for(int i = 0; i <10000; i++) {
            tmp = (int)Math.random()*100;
            set.add(tmp);
        }

        long startTime, estimatedTime;
        startTime = System.nanoTime();
        set.add(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in "+set.getClass().getName()+": " + estimatedTime);

        /////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        set.contains(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check contains in "+set.getClass().getName()+": " + estimatedTime);

        ///////////////////////////////////////////////////////

        startTime = System.nanoTime();
        set.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("removing from "+set.getClass().getName()+": " + estimatedTime);

    }

    public static void compareMaps(Map<Integer,Double>map){
        /*Map<Integer, Double> hashMap = new HashMap<Integer, Double>();
        Map<Integer, Double> linkedHashMap = new LinkedHashMap<Integer, Double>();
        Map<Integer, Double> treeMap = new TreeMap<Integer, Double>();*/
        int tmp = 0;
        double db = 0;
        for(int i = 0; i < 10000; i++) {
            tmp = (int)Math.random()*100;
            db = Math.random()*150;
            map.put(tmp, db );
/*            linkedHashMap.put(tmp, db);
            treeMap.put(tmp, db);*/
        }

        long startTime, estimatedTime;
        startTime = System.nanoTime();
        map.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in "+map.getClass().getName()+": " + estimatedTime);

        /*startTime = System.nanoTime();
        linkedHashMap.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in treeMap: " + estimatedTime);*/

        ////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        map.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check "+map.getClass().getName()+": " + estimatedTime);

        /*startTime = System.nanoTime();
        linkedHashMap.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check treeMap: " + estimatedTime);*/

        ////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        map.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from "+map.getClass().getName()+": " + estimatedTime);

        /*startTime = System.nanoTime();
        linkedHashMap.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from treeMap: " + estimatedTime);*/
    }
}
