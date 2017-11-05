package compare_collections;

public class Main {
    public static void main(String[] args) {
        Compare.compareLists();
        System.out.println();
        System.out.println("LinkedList лучше подходит для задач с большим количеством операций вставки, удаления элементов из списка\n" +
                "В остальных случаях ArrayList выигрывает(при поиске и доступе к элементу) \n");
        System.out.println();
        Compare.compareMaps();
        System.out.println();
        System.out.println("LinkedHashMap быстрее осуществляет поиск, добавление удаление элемета\n" +
                "TreeMap проигрывает в операциях поиска и добавления");
        System.out.println();
        Compare.compareSets();
        System.out.println();
        System.out.println("TreeSet и LinkedSet быстрее делают вставку элемента, hashSet гораздо хуже\n" +
                "Поиск элемента в множестве быстрее осуществляет TreeSet, LinkedSet, HashSet хуже\n" +
                "Удаление элемента из множества быстрее всего выполняется в LinkedSet");
          }
}
