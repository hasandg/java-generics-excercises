package com.hasandag.generics.introduction.generictypes;

public class BoxMain {
    public static void main(String[] args) {

        // BoxNonGeneric<Integer> integerBoxNonGeneric = new BoxNonGeneric(); // error


        Box<Integer> integerBox = new Box<>();
        //integerBox.set("try"); error
        integerBox.set(15);

        Box<String> stringBox = new Box<>();
        stringBox.set("try");
        // stringBox.set(15); error

    }
}
