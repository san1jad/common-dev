package com.common.dto.info;

import com.common.constant.error.ErrorConstant;
import com.common.validator.nullOrNotBlank.NullOrNotBlank;
import lombok.Data;

@Data
public class ItemDTO {

    private Long id;

    @NullOrNotBlank(message = ErrorConstant.REQUIRED_ITEM_NAME)
    private String name;
}
