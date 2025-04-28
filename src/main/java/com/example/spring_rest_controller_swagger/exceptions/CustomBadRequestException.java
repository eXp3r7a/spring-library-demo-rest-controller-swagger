package com.example.spring_rest_controller_swagger.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomBadRequestException extends RuntimeException {

    public CustomBadRequestException(String message) {
        super(message);
    }

    public CustomBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
