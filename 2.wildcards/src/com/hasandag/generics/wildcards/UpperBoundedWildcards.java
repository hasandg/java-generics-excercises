package com.hasandag.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(doubleList));

    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
