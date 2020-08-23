package generic;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class GenericDemo {
    public static void main(String[] args) {

        MyGenericClass<Integer> generic = new MyGenericClass<>(58);

        generic.displayObjectDetails();

        System.out.println("Object " + generic.getObject());

        MyGenericClass<String> genericString = new MyGenericClass<>("Akila");

        genericString.displayObjectDetails();

        System.out.println("Object " + genericString.getObject());
    }
}
