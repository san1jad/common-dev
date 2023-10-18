package com.common.dto.user;

import com.common.constant.error.ErrorConstant;
import com.common.validator.nullOrNotBlank.NullOrNotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_STREET)
    private String username;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_EMAIL)
    @Email(message = ErrorConstant.INVALID_EMAIL_ID)
    private String email;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_PW)
    private String password;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_ADD)
    private List<AddressDTO> addressList;

    @NotNull(message = ErrorConstant.REQUIRED_PHONE)
    private List<PhoneDTO> phoneList;
}
