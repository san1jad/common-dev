package com.common.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
@Data
public class HandledInternalServerException extends RuntimeException {
    String errorType;

    public HandledInternalServerException() {
        super();
    }

    public HandledInternalServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandledInternalServerException(String message) {
        super(message);
    }

    public HandledInternalServerException(Throwable cause) {
        super(cause);
    }

    public HandledInternalServerException(String message, String errorType) {
        super(message);
        this.errorType = errorType;
    }
}