package collection;

import java.util.*;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 10; i < 100; i = i + 10) {
            list.add(i);
        }

//        System.out.println("List " + list);

        list.add(3, 177);

        if (list.contains(177)) {
            System.out.println("Contain ");
        }

        Integer[] a = {4, 8, 6, 4, 7};

        List<Integer> l2 = Arrays.asList(a);

        List<String> l3 = Arrays.asList("ass", "asas", "asas");

        list.addAll(l2);

//        System.out.println("List " + list);

        list.remove(4);

//        System.out.println("List " + list);


        Iterator iterator=list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
//            iterator.remove();
        }

        System.out.println(list);


        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
