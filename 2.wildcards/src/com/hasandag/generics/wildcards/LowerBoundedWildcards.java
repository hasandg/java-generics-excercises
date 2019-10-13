package com.hasandag.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);

        List<Double> doubleList = new ArrayList<>();
        //addNumbers(doubleList); // compile time error
    }


    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

}
