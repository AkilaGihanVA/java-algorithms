package generic;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
//public class MyGenericClass<T extends String> {
public class MyGenericClass<T> {
    T onj;

    MyGenericClass(T obj){
        this.onj=obj;
    }

    public void displayObjectDetails(){
        System.out.println("The type of object : "+onj.getClass().getName());
    }

    public T getObject(){
        return onj;
    }
}
