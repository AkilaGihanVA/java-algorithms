package wildcard;

import java.util.ArrayList;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class WildCardDemo {

    public static void main(String[] args) {
        method(new ArrayList<A>());
        method2(new ArrayList<Thread>());
    }

    public static void method(ArrayList<? super B> list) {
        list.add(null);
        list.add(new B());
    }

    public static void method2(ArrayList<? extends Runnable> list) {
        list.add(null);
    }
}
