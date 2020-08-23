package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/18/2020
 * @project JAVA_ALGORITHMS
 */
public class ArraySum {
    public static void main(String[] args) {

        // Check given array have values that sum equals to 8

        List<Integer> a1 = new ArrayList<>();
        a1.addAll(Arrays.asList(2, 4, 9, 4, 7, 5));

        System.out.println("Sum exists " + checkSum(a1, 8));
    }

    private static boolean checkSum(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            int b = 8 - a;
            list.remove(i);
            i++;
            if (a < 8 && list.contains(b)) {
                System.out.println(a + " " + b);
                return true;
            }
        }
        return false;
    }
}
