package searching;

/**
 * @author AKILA_GIHAN on 8/23/2020
 * @project JAVA_ALGORITHMS
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 6, 2, 88, 22, 4, 8, 1};
        int[] b = insertionSort(a);

        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        int result = search(a, 22);

        System.out.println("Result : " + result);
    }

    static int[] insertionSort(int[] a) {
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

    static int search(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
