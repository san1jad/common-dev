package com.common.validator.idNotNullorEmpty;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdNotNullOrEmptyValidator.class)
public @interface IdNotNullOrEmpty {

    String message() default "${javax.validation.constraints.IdNotNullOrEmpty.message}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default {};

}
