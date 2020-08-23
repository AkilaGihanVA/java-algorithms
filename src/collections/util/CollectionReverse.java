package collections.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class CollectionReverse {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(14,85,99,45,11,68,99,47);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println("Reverse List : "+list);
    }
}
