package com.hasandag.generics.introduction.generictypes;

public class MultipleTypeParametersMain {

    public static void main(String[] args) {

        IPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        IPair<String, String> p2 = new OrderedPair<>("hello", "world");



        //Parameterized Types
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<>());


    }
}
