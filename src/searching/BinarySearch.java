package searching;

import java.util.Arrays;

/**
 * @author AKILA_GIHAN on 8/24/2020
 * @project JAVA_ALGORITHMS
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {4, 6, 2, 6, 2, 88, 22, 4, 8, 1};

        Arrays.sort(a);

        System.out.println(binarySearch(a, 6, 0, a.length));

        // Recursive

        System.out.println(binarySearchRecursive(a, 6, 0, a.length));
    }

    static int binarySearch(int[] a, int v, int left, int right) {

        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (a[mid] == v) {
                return mid;
            } else if (v < a[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int[] a, int v, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + ((right - left) / 2);
        if (a[mid] == v) {
            return mid;
        } else if (v < a[mid]) {
            return binarySearchRecursive(a, v, left, mid);
        } else {
            return binarySearchRecursive(a, v, mid, right);
        }

    }
}
