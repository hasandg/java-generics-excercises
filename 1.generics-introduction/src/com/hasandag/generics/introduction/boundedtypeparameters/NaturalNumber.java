package com.hasandag.generics.introduction.boundedtypeparameters;

public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    public static void main(String[] args) {
       // NaturalNumber naturalNumber = new NaturalNumber(10.5); error

       // NaturalNumber naturalNumber = new NaturalNumber(10); warning raw type
        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(10);
        System.out.println(naturalNumber.isEven());
    }
}