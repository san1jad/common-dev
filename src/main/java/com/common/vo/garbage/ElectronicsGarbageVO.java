package com.common.vo.garbage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElectronicsGarbageVO {

    private Long id;
    private String itemName;
    private String disposalMethodName;
    private double weight;
    private String weightUnit;
    private LocalDate createdAt;
}
