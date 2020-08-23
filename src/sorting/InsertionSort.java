package sorting;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project JAVA_ALGORITHMS
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 6, 2, 88, 22, 4, 8, 1};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    static int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
