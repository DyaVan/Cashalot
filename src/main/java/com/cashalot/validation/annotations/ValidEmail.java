package com.cashalot.validation.annotations;

import com.cashalot.validation.validators.CustomEmailValidator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD,PARAMETER,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CustomEmailValidator.class)
@Documented
@NotEmpty
public @interface ValidEmail {
    String message() default "Invalid email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
