package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<StringBuffer> buffers=new TreeSet<>(new StringBufferCoparator());

        buffers.add(new StringBuffer("zxc"));
        buffers.add(new StringBuffer("wgc"));
        buffers.add(new StringBuffer("asxc"));
        buffers.add(new StringBuffer("bdjc"));

        for(StringBuffer stringBuffer: buffers){
            System.out.println(stringBuffer);
        }


        TreeSet<Integer> set=new TreeSet<>();

        for(int i=0; i<100; i++){
            set.add(i);
        }

        System.out.println(set);

        //lowest element that grater than or equal to this
        System.out.println("lowest element that grater than or equal to 40, celling : "+set.ceiling(40));

        // lowest element that grater than to this
        System.out.println("lowest element that grater than to 40, higher : "+set.higher(40));

        //highest element that less than or equal to this
        System.out.println("highest element that less than or equal to 20, floor : "+set.floor(10));

        //highest element that less than to this
        System.out.println("highest element that less than to 20, lower : "+set.lower(10));

        //remove and return the first element
        System.out.println("remove and return the first element, pollFirst : "+set.pollFirst());

        //remove and return the last element
        System.out.println("remove and return the last element, pollLast : "+set.pollLast());

        // descending
        System.out.println(set.descendingSet());

    }
}
