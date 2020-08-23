package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author AKILA_GIHAN on 8/17/2020
 * @project JAVA_ALGORITHMS
 */
public class SameElementInArrays {
    public static void main(String args[]) {
        String[] array1 = {"a", "b", "C"};
        String[] array2 = {"x", "j", "m"};

        checkArray(array1, array2);

        // better solution

        betterCheck(array1, array2);
    }

    private static void checkArray(String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("Same one here!");
                    break;
                }
            }
        }
    }

    private static void betterCheck(String[] array1, String[] array2){
        Set<String> stringSet=new HashSet<>(Arrays.asList(array1));
        for(int i=0; i< array2.length; i++){
            if(stringSet.contains(array2[i])){
                System.out.println("Same one exits here!");
                break;
            }
        }
    }
}
