package com.joaop_Cardoso.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperatorException extends RuntimeException {
    public UnsupportedMathOperatorException(String message) {
        super(message);
    }
}
