package searching;

import java.util.Arrays;

/**
 * @author AKILA_GIHAN on 8/23/2020
 * @project JAVA_ALGORITHMS
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 6, 2, 88, 22, 4, 8, 1};

        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        int result = search(a, 22);

        System.out.println("Result : " + result);
    }

    static int search(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
