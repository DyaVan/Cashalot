package com.cashalot.validation.annotations;


import com.cashalot.validation.validators.CustomUniqueEmailValidator;
import com.cashalot.validation.validators.RightAmountValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD,PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = RightAmountValidator.class)
@Documented
public @interface RightAmount {
    int min() default 2;
    int max() default 6;
    String message() default "Invalid list size.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
