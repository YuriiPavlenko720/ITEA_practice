package HW_10_02;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
@Documented
public @interface Color {

    /**
     * @return color of shape
     */
    String color() default "White";
}
