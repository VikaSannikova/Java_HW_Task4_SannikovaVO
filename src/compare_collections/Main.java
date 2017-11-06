package compare_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Compare.compareLists(new ArrayList<Integer>());
        Compare.compareLists(new LinkedList<Integer>());

        System.out.println();
        System.out.println("LinkedList лучше подходит для задач с большим количеством операций вставки, удаления элементов из списка\n" +
                "В остальных случаях ArrayList выигрывает(при поиске и доступе к элементу) \n");
        System.out.println();

        Compare.compareSets(new HashSet<Integer>());
        Compare.compareSets(new LinkedHashSet<Integer>());
        Compare.compareSets(new TreeSet<Integer>());

        System.out.println();
        System.out.println("TreeSet и LinkedSet быстрее делают вставку элемента, hashSet гораздо хуже\n" +
                "Поиск элемента в множестве быстрее осуществляет TreeSet, LinkedSet, HashSet хуже\n" +
                "Удаление элемента из множества быстрее всего выполняется в LinkedSet");
        System.out.println();

        Compare.compareMaps(new HashMap<Integer, Double>());
        Compare.compareMaps(new LinkedHashMap<Integer, Double>());
        Compare.compareMaps(new TreeMap<Integer, Double>());
        System.out.println();
        System.out.println("LinkedHashMap быстрее осуществляет поиск, добавление удаление элемета\n" +
                "TreeMap проигрывает в операциях поиска и добавления");
        System.out.println();


          }
}
