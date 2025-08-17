package com.joaop_Cardoso.controllers;

import com.joaop_Cardoso.exception.ExceptionResponse;
import com.joaop_Cardoso.exception.UnsupportedMathOperatorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static com.joaop_Cardoso.Math.SimpleOperations.*;
import static com.joaop_Cardoso.services.ControllerValidations.*;

@RestController
@RequestMapping("/math")
public class MathController {
    //http://localhost:8080/math

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1,number2);
        return sumOperation(number1,number2);
    }

    @RequestMapping("/subtraction/{number1}/{number2}")
    public Double subtraction(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1,number2);
        return subtractionOperation(number1,number2);
    }

    @RequestMapping("/multiplication/{number1}/{number2}")
    public Double multiplication(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1,number2);
        return multiplicationOperation(number1,number2);
    }

    @RequestMapping("/division/{number1}/{number2}")
    public Double division(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1,number2);
        return divisionOperation(number1,number2);
    }

    @RequestMapping("/average/{number1}/{number2}")
    public Double average(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1,number2);
        return averageOperation(number1, number2);
    }

    @RequestMapping("/squareroot/{number}")
    public Double squareroot(@PathVariable("number") String number) throws Exception
    {
        numberValidation(number);
        return squareRootOperation(number);
    }

}
