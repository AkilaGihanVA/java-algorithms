package collection;

import java.util.*;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class SetDemo {
    public static void main(String[] args) {
        Random random=new Random();

        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0; i<10; i++){
            int a=random.nextInt(5);
            list.add(a);
            set.add(a);
        }

        System.out.println("List "+list);
        System.out.println("Set "+set);

        Set<Integer> newSet= new HashSet<>(list);

        System.out.println("New Set "+newSet);

        Set<Integer> keepOrderList= new LinkedHashSet<>(list);

        System.out.println("Lisnked Set "+keepOrderList);


        Set<Integer> treeSet= new TreeSet<>(list);

        System.out.println("Tree set "+treeSet);
    }
}
