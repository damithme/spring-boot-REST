package com.mydevgeek.util.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by DAM on 3/9/17.
 */
@Documented
@Constraint(validatedBy = UsernameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Username {

    String message() default "{Username}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
