package com.hasandag.generics.introduction.typeinference;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {

    //inference determines that the second argument being passed to the pick method is of type Serializable:
    static <T> T pick(T a1, T a2) { return a2; }
    Serializable s = pick("d", new ArrayList<String>());

    public static void main(String[] args) {

    }
}
