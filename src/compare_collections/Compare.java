package compare_collections;

import java.util.*;

public class Compare
{
    public static void compareLists(){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        int tmp = 0;
        for(int i = 0; i < 1000; i++) {
            tmp = (int)Math.random()*100;
            arrayList.add(tmp);
            linkedList.add(tmp);
        }

        long startTime = System.nanoTime();
        arrayList.add(47, 9);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.add(47, 9);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in LinkedList: " + estimatedTime);

        ////////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        arrayList.get(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("getting element from ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.get(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("getting element from LinkedList: " + estimatedTime);

        ///////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        arrayList.indexOf(9);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("indexOf element from ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.indexOf(9);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("indexOf element from LinkedList: " + estimatedTime);

        ///////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        arrayList.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from ArrayList (begin): " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from LinkedList (begin): " + estimatedTime);
    }

    public static void compareSets(){
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> linkedSet = new LinkedHashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();
        int tmp = 0;
        for(int i = 0; i <1000; i++) {
            tmp = (int)Math.random()*100;
            hashSet.add(tmp);
            linkedSet.add(tmp);
            treeSet.add(tmp);
        }

        long startTime, estimatedTime;
        startTime = System.nanoTime();
        hashSet.add(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in hashSet: " + estimatedTime);

        startTime = System.nanoTime();
        linkedSet.add(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in linkedSet: " + estimatedTime);

        startTime = System.nanoTime();
        treeSet.add(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("adding in treeSet: " + estimatedTime);

        /////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        hashSet.contains(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check contains in hashSet: " + estimatedTime);

        startTime = System.nanoTime();
        hashSet.contains(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check contains in linkedSet: " + estimatedTime);

        startTime = System.nanoTime();
        hashSet.contains(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check contains in treeSet: " + estimatedTime);

        ///////////////////////////////////////////////////////

        startTime = System.nanoTime();
        hashSet.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("removing from hashSet: " + estimatedTime);

        startTime = System.nanoTime();
        linkedSet.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("removing from linkedSet: " + estimatedTime);

        startTime = System.nanoTime();
        treeSet.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("removing from treeSet: " + estimatedTime);
    }

    public static void compareMaps(){
        Map<Integer, Double> hashMap = new HashMap<Integer, Double>();
        Map<Integer, Double> linkedHashMap = new LinkedHashMap<Integer, Double>();
        Map<Integer, Double> treeMap = new TreeMap<Integer, Double>();
        int tmp = 0;
        double db = 0;
        for(int i = 0; i < 1000; i++) {
            tmp = (int)Math.random()*100;
            db = Math.random()*150;
            hashMap.put(tmp, db );
            linkedHashMap.put(tmp, db);
            treeMap.put(tmp, db);
        }

        long startTime, estimatedTime;
        startTime = System.nanoTime();
        hashMap.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in hashMap: " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.put(47, 9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("put in treeMap: " + estimatedTime);

        ////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        hashMap.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check hashMap: " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.containsValue(9.0);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("check treeMap: " + estimatedTime);

        ////////////////////////////////////////////////////////

        startTime = System.nanoTime();
        hashMap.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from hashMap: " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from linkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.remove(47);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("remove from treeMap: " + estimatedTime);
    }
}
