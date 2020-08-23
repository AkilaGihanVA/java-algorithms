package collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class SortedList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Zsfsfsf");
        list.add("Afd");
        list.add("Sfdsfsdfsd");
        list.add("Ddfdsfsf");
        list.add("Q");

        System.out.println(list);

        // Descending length
        Collections.sort(list, (s1, s2) -> s2.length() - s1.length());

//        System.out.println("After Sort : " + list);

        // Ascending order
        Collections.sort(list);

        System.out.println("Sorted list " + list);

        int result = Collections.binarySearch(list, "Afd");
        System.out.println("Index of Afd " + result);
    }
}
