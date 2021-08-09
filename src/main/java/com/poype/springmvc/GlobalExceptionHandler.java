package com.poype.springmvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler({ArithmeticException.class})
    public String handleArithmeticException(Exception ex){
        System.out.println("GlobalExceptionHandler ex: " + ex);
        return "GlobalExceptionHandler";
    }
}
