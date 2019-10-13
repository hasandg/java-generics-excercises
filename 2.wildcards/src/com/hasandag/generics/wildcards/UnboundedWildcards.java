package com.hasandag.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");

        //printObjectList(li); //compile time error because List<Integer> not subclass of List<Object>

        printList(li);
        printList(ls);


    }



    public static void printObjectList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}
