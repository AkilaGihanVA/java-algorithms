package sorting;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project JAVA_ALGORITHMS
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 6, 2, 88, 22, 4, 8, 1};
        int[] b = sort(a);

        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
