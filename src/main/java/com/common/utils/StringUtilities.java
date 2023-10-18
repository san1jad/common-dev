package com.common.utils;

import com.common.constant.error.ErrorConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

@Slf4j
public class StringUtilities {

    public static String getFieldErrorsList(Errors errors){
        String errorMsg = "";
        for (Object object : errors.getAllErrors()) {
            if(object instanceof FieldError) {
                FieldError fieldError = (FieldError) object;
                errorMsg+=fieldError.getDefaultMessage();
            }
            errorMsg+= ErrorConstant.ERROR_BREAK;
        }
        return errorMsg;
    }
}
