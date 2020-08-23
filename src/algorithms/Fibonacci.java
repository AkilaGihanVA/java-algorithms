package algorithms;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project JAVA_ALGORITHMS
 */
public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 ...

        System.out.println(fibonacci1(40));
        System.out.println(fibonacciRecursive(2));
    }

    static int fibonacci1(int index) {
        int value1 = 0;
        int value2 = 1;
        for (int i = 1; i < index; i++) {
            int temp = value2;
            value2 = value1 + value2;
            value1 = temp;
        }
        return value2;
    }

    static int fibonacciRecursive(int index) {
        if (index < 2)
            return index;
        else
            return fibonacciRecursive(index - 1) + fibonacciRecursive(index - 2);
    }
}
