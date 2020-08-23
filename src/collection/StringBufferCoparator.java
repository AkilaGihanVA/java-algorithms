package collection;

import java.util.Comparator;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class StringBufferCoparator implements Comparator<StringBuffer> {
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }
}
