package arrays.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author AKILA_GIHAN on 8/21/2020
 * @project JAVA_ALGORITHMS
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] a = {42, 58, 98, 44, 22, 65, 11, 75};

        System.out.println("Before sort ");
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

        Arrays.sort(a);

        System.out.println("After sort ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] strings = {"qs", "Rg", "As", "Ol", "Bn"};

        System.out.println("Before sort Strings ");
        for (String i : strings) {
            System.out.print(i + " ");
        }

        System.out.println();

        Arrays.sort(strings, (s1, s2) -> s1.compareTo(s2));


        System.out.println("After sort Strings ");
        for (String i : strings) {
            System.out.print(i + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(strings, "Ol");

        System.out.println("Ol is in index of " + index);

        /**
         * You can't perform the add or remove operation when you create a list from and array
         */
        List<String> list=Arrays.asList(strings);
//        list.add("sdsd"); Error

//        list.remove(2); Error
        if(list.contains("Rg"))
            System.out.println("Yes!");
    }
}
