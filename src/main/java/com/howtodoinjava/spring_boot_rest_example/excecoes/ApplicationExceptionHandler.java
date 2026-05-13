package com.howtodoinjava.spring_boot_rest_example.excecoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String itemNotFoundHandler(ItemNotFoundException ex) {
        return ex.getMessage();
    }

}
