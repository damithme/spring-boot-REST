package com.mydevgeek.util.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by DAM on 3/9/17.
 */
public class UsernameValidator implements ConstraintValidator<Username, String> {
    public void initialize(Username constraintAnnotation) {

    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ("mydevgeek".equalsIgnoreCase(value)) {
            return false;
        }
        return true;
    }
}
