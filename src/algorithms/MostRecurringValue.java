package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class MostRecurringValue {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 4, 2, 6, 8, 1, 5};

        System.out.println(mostRecurringValue(a));
    }

    private static int mostRecurringValue(int[] a) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            if (map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            } else {
                map.put(v, 1);
            }
        }
        int index = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < map.get(a[i])) {
                max = map.get(a[i]);
                index = a[i];
            }
        }
        return index;
    }
}
