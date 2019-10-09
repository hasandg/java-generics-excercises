package com.hasandag.generics.introduction.generictypes;

public class MyCustomClass {
    Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value of MyCustomClass is: " + value;
    }
}
