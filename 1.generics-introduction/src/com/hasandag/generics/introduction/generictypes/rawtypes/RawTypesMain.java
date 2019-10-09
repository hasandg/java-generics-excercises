package com.hasandag.generics.introduction.generictypes.rawtypes;

import com.hasandag.generics.introduction.generictypes.Box;
import com.hasandag.generics.introduction.generictypes.MyCustomClass;

public class RawTypesMain {

    public static void main(String[] args) {
        //To create a parameterized type of Box<T>, you supply an actual type argument for the formal type parameter T:

        Box<Integer> intBox = new Box<>();
        // If the actual type argument is omitted, you create a raw type of Box<T>:

        Box rawBox = new Box();

        Box<String> stringBox = new Box<>();
        Box rawBox2 = stringBox;               // OK


        Box rawBox3 = new Box();           // rawBox3 is a raw type of Box<T>
        Box<Integer> intBox2 = rawBox3;     // warning: unchecked conversion


        Box rawBox4 ;//= intBox;
      //  rawBox4.set("8");  // warning: unchecked invocation to set(T)
      //  System.out.println(rawBox4.get());


        Box<MyCustomClass> myCustomClassBox = new Box<>();

        rawBox4 = myCustomClassBox;
        // myIntegerBox.set("aaa"); error

        rawBox4.set(new MyCustomClass());

        System.out.println( rawBox4.getClass());
        System.out.println( rawBox4.get().getClass());

        System.out.println(rawBox4.get());


    }




}
