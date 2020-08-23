package algorithms;

/**
 * @author AKILA_GIHAN on 8/18/2020
 * @project JAVA_ALGORITHMS
 */
public class Factorial {
    public static void main(String[] args) {
        findFactorial(6);

        System.out.println("Recursion factorial : "+ factorial(6));
    }

    public static void findFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("algorithms.Factorial of " + num + " is : " + fact);
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
