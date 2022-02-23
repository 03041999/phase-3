package com.myoffice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.myoffice.exceptions.ProductNotFoundException;

@ControllerAdvice
public class Exceptioncontroller {

        @ExceptionHandler(value = ProductNotFoundException.class)
           public ResponseEntity<Object> exception(ProductNotFoundException exception) {
              return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
           }
}
