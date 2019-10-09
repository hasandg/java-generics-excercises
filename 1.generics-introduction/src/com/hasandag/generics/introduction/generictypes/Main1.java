package com.hasandag.generics.introduction.generictypes;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        //The following code snippet without generics requires casting:
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);



        //When re-written to use generics, the code does not require casting:
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        String str2 = list2.get(0);   // no cast
    }
}
