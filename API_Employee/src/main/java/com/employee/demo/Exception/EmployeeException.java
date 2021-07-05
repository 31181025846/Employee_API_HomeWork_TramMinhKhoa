package com.employee.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class EmployeeException extends RuntimeException{
    public EmployeeException(Long a) {
        super("Employee id "+ a+ " not food!");
    }

}
