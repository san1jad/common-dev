package com.common.dto.info;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DisposalMethodDTO {

    private Long id;

    @NotBlank(message = "method name should not blank")
    @NotNull(message = "method name should not null")
    private String method;
}
