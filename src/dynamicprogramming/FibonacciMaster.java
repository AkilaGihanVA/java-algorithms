package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AKILA_GIHAN on 8/23/2020
 * @project JAVA_ALGORITHMS
 */
public class FibonacciMaster {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 ...

        // O(2^n) -> O(n)   improved performance

        System.out.println(fibonacci(42));
    }

    static Map<Integer, Integer> map = new HashMap<>();

    static int fibonacci(int value) {
        if (map.containsKey(value)) {
            return map.get(value);
        } else {
            if (value < 2) {
                return value;
            } else {
                int result = fibonacci(value - 1) + fibonacci(value - 2);
                map.put(value, result);
                return result;
            }
        }
    }
}
