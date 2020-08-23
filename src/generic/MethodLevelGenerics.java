package generic;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class MethodLevelGenerics {

    public <T> void method(T ob){

    }

    public <K extends Runnable> void method2(K k){

    }

    public <T extends Runnable&Comparable<String>> void method3(T t){

    }
}
