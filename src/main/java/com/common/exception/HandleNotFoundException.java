package com.common.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not found")
@Data
public class HandleNotFoundException extends RuntimeException{
    String errorType;

    public HandleNotFoundException() {
        super();
    }

    public HandleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandleNotFoundException(String message) {
        super(message);
    }

    public HandleNotFoundException(Throwable cause) {
        super(cause);
    }

    public HandleNotFoundException(String message, String errorType) {
        super(message);
        this.errorType = errorType;
    }
}
