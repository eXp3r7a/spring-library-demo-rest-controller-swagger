package com.example.spring_rest_controller_swagger.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class CustomUnauthorizedException extends RuntimeException {

    public CustomUnauthorizedException(String message) {
        super(message);
    }

    public CustomUnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
