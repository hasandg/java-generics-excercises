package com.hasandag.generics.introduction.generictypes;

public class BoxMain {
    public static void main(String[] args) {

        ///com.hasandag.generics.introduction.generictypes.BoxNonGeneric<Integer> integerBoxNonGeneric = new com.hasandag.generics.introduction.generictypes.BoxNonGeneric(); error


        Box<Integer> integerBox = new Box<>();
        //integerBox.set("try"); error
        integerBox.set(15);

        Box<String> stringBox = new Box<>();
        stringBox.set("try");
        // stringBox.set(15); error

    }
}
