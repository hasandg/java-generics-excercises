package com.hasandag.generics.introduction.typeinference;

import com.hasandag.generics.introduction.generictypes.Box;

import java.util.Collections;
import java.util.List;

public class BoxDemo {

    public static <U> void addBox(U u,
                                  java.util.List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box: boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" +
                    boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Box<Integer>> listOfIntegerBoxes =
                new java.util.ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes); //<Integer> is unnecessary
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);  //Integer.valueOf() is unnecessary
        BoxDemo.addBox(30, listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);

        List<String> listOne = Collections.<String>emptyList(); //in jdk 1.7 <String> is necessary but in 1.8 this is unnecessary
        List<String> listTwo = Collections.emptyList();
        List listThree = Collections.emptyList();
    }
}