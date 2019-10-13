package com.hasandag.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardsAndSubtyping {

    static class A { /* ... */ }
    static class B extends A { /* ... */ }

    public static void main(String[] args) {
        B b = new B();
        A a = b;

        List<B> lb = new ArrayList<>();
        //List<A> la = lb;   // compile-time error

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>

    }
}
