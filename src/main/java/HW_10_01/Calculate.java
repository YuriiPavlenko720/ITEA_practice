package HW_10_01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 Анотація з двома параметрами: 1) назва операції та 2) масив синонімів що відповідають операції.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Calculate {
    String operation();
    String[] aliases();

}
