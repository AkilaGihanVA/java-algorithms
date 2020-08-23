package algorithms;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project JAVA_ALGORITHMS
 */
public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(factorial1(5));
        System.out.println(factorialRecusive(5));
    }

    static int factorial1(int value) {
        int fact = 1;
        while (true) {
            if (value == 0)
                return fact;
            else
                fact *= value;
            value--;
        }
    }

    static int factorialRecusive(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * factorialRecusive(value - 1);
        }
    }
}
