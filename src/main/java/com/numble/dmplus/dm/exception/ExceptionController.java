package com.numble.dmplus.dm.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.reflect.Field;

@ControllerAdvice
@Slf4j
public class ExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ErrorResponse invalidRequest(MethodArgumentNotValidException e)
    {

        ErrorResponse errorResponse = new ErrorResponse("400","잘못된 요청입니다.");

        for (FieldError fieldError : e.getFieldErrors())
        {
            errorResponse.addValidation(fieldError.getField(), fieldError.getDefaultMessage());
        }
            return errorResponse;
    }





}
