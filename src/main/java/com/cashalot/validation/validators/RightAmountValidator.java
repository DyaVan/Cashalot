package com.cashalot.validation.validators;

import com.cashalot.validation.annotations.RightAmount;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;


public class RightAmountValidator implements ConstraintValidator<RightAmount,List> {

    private int min;
    private int max;

    @Override
    public void initialize(RightAmount rightAmount) {
        this.max = rightAmount.max();
        this.min = rightAmount.min();
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list.size() > min && list.size() < max;
    }
}
