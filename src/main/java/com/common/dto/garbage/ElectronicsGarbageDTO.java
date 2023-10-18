package com.common.dto.garbage;

import com.common.validator.idNotNullorEmpty.IdNotNullOrEmpty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ElectronicsGarbageDTO {

    private Long id;

    @NotNull(message = "Item id should not null, zero or less than zero")
    private Long itemNameId;

    @NotNull(message = "weight should not null")
    private double weight;

    @NotNull(message = "weight unit should not null")
    private String weightUnit;

    @NotNull(message = "Disposal method id should not null, zero or less than zero")
    private Long disposalMethodId;

    private LocalDate createdAt;
}
