package com.java.puzzle.springbootvalidation.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidUserValidator.class)
public @interface ValidUser {

    public String message() default "Invalid User";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
