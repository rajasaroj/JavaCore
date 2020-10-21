package org.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface MytypeAnnotator {}
public class TypeAnnotation {

    public static void hype() {
       @MytypeAnnotator String name = "this is annotated";
        System.out.println(name);
    }

    public static @MytypeAnnotator int vibe() {
        return 9;
    }

    public static void main(String[] args) {
        System.out.println(vibe());
        hype();
    }
}
