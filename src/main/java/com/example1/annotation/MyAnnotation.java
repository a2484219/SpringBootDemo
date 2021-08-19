package com.example1.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/12/12 0012.
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "";
}
