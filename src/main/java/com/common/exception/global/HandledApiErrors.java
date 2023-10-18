package com.common.exception.global;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class HandledApiErrors {
    private Date timestamp;
    private String errorType;
    private List<String> errors;

    public HandledApiErrors(String errorType, List<String> errors) {
        super();
        this.errors = errors;
        this.errorType = errorType;
        this.timestamp = new Date();
    }

    public HandledApiErrors(String errorType,String error) {
        super();
        this.errorType = errorType;
        this.errors = Arrays.asList(error);
        this.timestamp = new Date();
    }

}
