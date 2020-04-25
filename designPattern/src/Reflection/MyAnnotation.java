package Reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//不写的话是runtime
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    String name();
    String age();
}
