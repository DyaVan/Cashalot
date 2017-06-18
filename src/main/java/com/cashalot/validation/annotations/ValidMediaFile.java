package com.cashalot.validation.annotations;


import com.cashalot.validation.validators.CustomEmailValidator;
import com.cashalot.validation.validators.CustomMediaFileValidator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD,PARAMETER,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CustomMediaFileValidator.class)
@Documented
@NotNull
public @interface ValidMediaFile {
    String message() default "Invalid file extension";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
