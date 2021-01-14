package com.martynenkoigor.javacore.chapter11;


import java.lang.annotation.*;
import java.lang.reflect.*;
import java.sql.SQLOutput;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

class Meta {

    @MyAnno()
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
