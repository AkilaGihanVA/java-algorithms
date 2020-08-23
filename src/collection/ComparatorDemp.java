package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class ComparatorDemp {
    public static void main(String[] args) {
//        Set<String> strings = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length())
//                    return 1;
//                else
//                    return -1;
//            }
//        });

        Set<String> strings = new TreeSet<>((o1, o2) -> o1.length() - o2.length());

        strings.add("sfsdf");
        strings.add("sfsdsdfsdf");
        strings.add("sdsdsdsdsdsdsfsd");
        strings.add("sfsdsdsf");
        strings.add("sfs");


        strings.forEach(s -> System.out.println(s));
    }
}
