package com.hasandag.generics.introduction.boundedtypeparameters;

public class MultipleBoundsExample {
    class A { /* ... */ }
    interface B { /* ... */ }
    interface C { /* ... */ }

    class D <T extends A & B & C> { /* ... */ }

    //If bound A is not specified first, you get a compile-time error:
    //class E <T extends B & A & C> { /* ... */ }  // compile-time error
}
