package org.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface signal { int getInt(); int getname(); }
public class SingleMemberAnnotation {

    @signal(getInt = 6, getname = 2)
    public static void meth() {
        try {

            SingleMemberAnnotation singleMemberAnnotation = new SingleMemberAnnotation();

            signal signal =singleMemberAnnotation.getClass().getMethod("meth").getAnnotation(signal.class);

            System.out.println(signal.getInt());

        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        meth();

    }
}
