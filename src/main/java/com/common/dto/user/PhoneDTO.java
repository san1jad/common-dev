package com.common.dto.user;

import com.common.constant.error.ErrorConstant;
import com.common.validator.nullOrNotBlank.NullOrNotBlank;
import com.common.validator.phone.PhoneNumber;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Valid
public class PhoneDTO {

    private Long id;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_PHONE)
    @PhoneNumber(message = ErrorConstant.INVALID_PHONE_NUMBER)
    private String phoneNumber;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_TYPE)
    private String type;
}
