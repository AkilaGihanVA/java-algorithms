package sorting;

/**
 * @author AKILA_GIHAN on 8/23/2020
 * @project JAVA_ALGORITHMS
 */
public class MergeSort {
    public static void main(String[] args) {
        // Efficient O(n log n)
        int[] a = {4, 6, 2, 6, 2, 88, 22, 4, 8, 1};
        int[] b = mergeSort(a);

        for (int i : b) {
            System.out.print(i + " ");
        }

        // This not implement well - TBI

    }

    static int[] mergeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int l = a.length / 2;
        int[] left = new int[l];
        int[] right = new int[a.length - l];
        for (int i = 0; i < l; i++) {
            left[i] = a[i];
            System.out.println("l "+left[i]);
        }
        int j = 0;
        for (int i = a.length - l; i < a.length; i++) {
            right[j] = a[i];
            System.out.println("r "+right[j]);
            j++;
        }

        return mergeArray(mergeSort(left), mergeSort(right));

    }

    static int[] mergeArray(int[] left, int[] right) {
        int[] k = new int[left.length + right.length];
        int a = 0, b = 0;
        for (int i = 0; i < k.length; i++) {
            if (a < left.length && b < right.length) {
                if (left[a] < right[b]) {
                    k[i] = left[a];
                    a++;
                } else {
                    k[i] = right[b];
                    b++;
                }
            } else if (a < left.length) {
                k[i] = left[a];
                a++;
            }
            if (b < right.length) {
                k[i] = right[b];
                b++;
            }
        }
        return k;
    }
}
