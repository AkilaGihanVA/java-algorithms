package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AKILA_GIHAN on 8/19/2020
 * @project JAVA_ALGORITHMS
 */
public class JoinArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {2, 7, 8};

        int[] ints1 = joinArrays(arr1, arr2);

        System.out.println(Arrays.toString(ints1));

        String[] s1 = {"a","w","c","z"};
        String[] s2 = {"q", "d", "l"};
        Object[] ints2 = joinArrays2(s1, s2);

        System.out.println(Arrays.toString(ints2));

    }

    static int[] joinArrays(int[] a1, int[] a2) {
        int[] rev = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, rev, 0, a1.length);
        System.arraycopy(a2, 0, rev, a1.length, a2.length);
        Arrays.sort(rev);
        return rev;
    }

    static Object[] joinArrays2(String[] a1, String[] a2) {
        List list=new ArrayList(Arrays.asList(a1));
        list.addAll(Arrays.asList(a2));
        Collections.sort(list);
        return list.toArray();
    }
}
