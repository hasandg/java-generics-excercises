package com.hasandag.generics.introduction.generictypes;

/**
 * Generic version of the com.hasandag.generics.introduction.generictypes.Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

}