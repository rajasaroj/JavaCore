package org.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



/*
  Create the repeatable annotation "@interface Words"
  you need to provide a container who is going to hold the array of repeatable annotation eg : @Repeatable(MyRepeatableWords.class)
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatableWords.class)
@interface Words {
    String word() default "hello";
    int value() default 0;
}

/*
  Create a Container class to hold the array of repeatable annotations objects
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatableWords {
    Words[] value();
}


public class MyRepeat {

    @Words(word = "hi", value = 1)
    @Words(word = "Raja", value = 2)
    public static void hype() {
        System.out.println("hype is over");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyRepeat myRepeat = new MyRepeat();
        MyRepeatableWords anno =  myRepeat.getClass().getMethod("hype").getAnnotation(MyRepeatableWords.class);
        System.out.println(anno);
    }
}
