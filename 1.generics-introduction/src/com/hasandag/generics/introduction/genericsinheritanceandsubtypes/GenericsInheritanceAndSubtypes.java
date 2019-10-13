package com.hasandag.generics.introduction.genericsinheritanceandsubtypes;

import com.hasandag.generics.introduction.generictypes.Box;

public class GenericsInheritanceAndSubtypes {

    public static void main(String[] args) {

        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // OK

        someMethod(new Integer(10));   // OK
        someMethod(new Double(10.1));   // OK


        Box<Number> box = new Box<>();
        box.set(new Integer(10));   // OK
        box.set(new Double(10.1));  // OK

        // boxTest(new Box<Integer>()); // Not OK
        // boxTest(new Box<Double>());  // Not OK  (Box<Integer> and Box<Double> are not subtypes of Box<Number>.)


        IPayloadList<String,String> iPayloadList1 = new PayloadList();
        IPayloadList<String,Integer> iPayloadList2;
        IPayloadList<String,Exception> iPayloadList3;

        iPayloadList1.setPayload(0,"Str3");
        iPayloadList1.setPayload(0,"Str4");
        // iPayloadList1.setPayload(0,10);  //Not OK




    }

    public static void someMethod(Number n) { /* ... */ }

    public static void boxTest(Box<Number> n) { /* ... */ }
}
