package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();

        for(int i=0; i<10; i++){
            map.put(i, "Akila"+i);
        }

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("Map "+map);
    }
}
