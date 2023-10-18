package com.common.validator.idNotNullorEmpty;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdNotNullOrEmptyValidator implements ConstraintValidator<IdNotNullOrEmpty, Long> {

    @Override
    public void initialize(IdNotNullOrEmpty parameters) {
        // Nothing to do here
    }

    public boolean isValid(Long value, ConstraintValidatorContext constraintValidatorContext) {
        return value == null || value <= 0;
    }
}
