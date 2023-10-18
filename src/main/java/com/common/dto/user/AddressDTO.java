package com.common.dto.user;

import com.common.constant.error.ErrorConstant;
import com.common.validator.nullOrNotBlank.NullOrNotBlank;
import jakarta.validation.Valid;
import lombok.Data;

@Data
@Valid
public class AddressDTO {

    private Long id;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_STREET)
    private String street;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_CITY)
    private String city;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_STATE)
    private String state;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_POSTAL_CODE)
    private String postalCode;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_COUNTRY)
    private String country;
}
