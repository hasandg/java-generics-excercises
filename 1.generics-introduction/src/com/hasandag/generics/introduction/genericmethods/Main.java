package com.hasandag.generics.introduction.genericmethods;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
      //  Pair<Integer, Integer> p2 = new Pair<>(2, 5); error on compare method
       // boolean same = Util.<Integer, String>compare(p1, p2); //warning
        boolean same = Util.compare(p1, p2);
    }
}
