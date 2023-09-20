package com.homework.homework.Spring.web.rest.controllers;

import com.homework.homework.Spring.web.rest.controllers.exception.RestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<RestException> handleIllegalArgumentException(IllegalArgumentException e) {
        // log
        log.info("coś poszło nie tak, rzucił IllegalArgumentException");
        return new ResponseEntity<>(new RestException("Rzuciło IllegalArgumentException", e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
