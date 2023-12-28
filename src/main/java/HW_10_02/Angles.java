package HW_10_02;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface Angles {

    /**
     * @return number of angles of shape
     */
    short angles() default 0;
}
