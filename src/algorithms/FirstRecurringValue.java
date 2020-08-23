package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class FirstRecurringValue {
    public static void main(String[] args) {
        int[] a = {2, 1, 1, 4, 2, 6, 8, 1, 5};

        System.out.println(firstRecurringValue(a));
    }

    private static int firstRecurringValue(int[] a) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            if (list.contains(v))
                return v;
            else
                list.add(v);
        }

        return -1;
    }
}
