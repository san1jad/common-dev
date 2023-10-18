package com.common.validator.phone;

import com.common.constant.regex.CommonRegexPatterns;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public void initialize(PhoneNumber parameters) {
        // Nothing to do here
    }

    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        return Pattern.compile(CommonRegexPatterns.PHONE_NUMBER).matcher(value).matches();

    }
}
