package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class MaximumSubArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));

        System.out.println(getMaximumSubArray(list));
    }

    private static List<Integer> getMaximumSubArray(List<Integer> list) {
        Collections.sort(list, (a1, a2) -> a2 - a1);
        List<Integer> maxArray = new ArrayList<>();
        int sum = 0;
        for (int a : list) {
            if (sum > (sum + a)) {
                break;
            } else {
                maxArray.add(a);
                sum += a;
            }
        }
        return maxArray;
    }
}
