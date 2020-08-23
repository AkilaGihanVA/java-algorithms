package sorting;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project JAVA_ALGORITHMS
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 6, 2, 88, 22, 4, 8, 1};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
