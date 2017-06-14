package com.cashalot.validation.validators;

import com.cashalot.domain.actors.AuthorizationDetails;
import com.cashalot.repository.AuthorizationDetailsRepository;
import com.cashalot.validation.annotations.UniqueEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Objects;


@Component
public class CustomUniqueEmailValidator implements ConstraintValidator<UniqueEmail,String> {

    @Autowired
    AuthorizationDetailsRepository AuthDetailsRepository;

    @Override
    public void initialize(UniqueEmail uniqueEmail) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        AuthorizationDetails details = AuthDetailsRepository.findByEmail(email);
        return Objects.isNull(details);
    }

}
