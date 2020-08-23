package algorithms;

import java.util.function.Function;

/**
 * @author AKILA_GIHAN on 8/19/2020
 * @project JAVA_ALGORITHMS
 */
public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverse("My name is Akila!"));

        // Using arrays
        System.out.println(reverse2("My name is Akila!"));

        // Best way
        Function<String, String> stringReverse = str -> new StringBuilder(str).reverse().toString();

        System.out.println(stringReverse.apply("My name is Akila!"));

        System.out.println("Recusive " + reverse3("My name is Akila!"));


    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String reverse2(String str) {
        char[] rev = new char[str.length()];
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            rev[i] = chars[str.length() - i - 1];
        }
        return new String(rev);
    }

    static String reverse3(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverse3(str.substring(0, str.length() - 1));
        }
    }
}
