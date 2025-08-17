package com.joaop_Cardoso.controllers;

import com.joaop_Cardoso.exception.ExceptionResponse;
import com.joaop_Cardoso.exception.UnsupportedMathOperatorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static com.joaop_Cardoso.services.ControllerValidations.*;

@RestController
@RequestMapping("/math")
public class MathController {
    //http://localhost:8080/math

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1);
        numberValidation(number2);
        return convertToDouble(number1) + convertToDouble(number2);
    }

    @RequestMapping("/subtraction/{number1}/{number2}")
    public Double subtraction(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1);
        numberValidation(number2);
        return convertToDouble(number1) - convertToDouble(number2);
    }

    @RequestMapping("/multiplication/{number1}/{number2}")
    public Double multiplication(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1);
        numberValidation(number2);
        return convertToDouble(number1) * convertToDouble(number2);
    }

    @RequestMapping("/division/{number1}/{number2}")
    public Double division(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1);
        numberValidation(number2);
        return convertToDouble(number1) / convertToDouble(number2);
    }

    @RequestMapping("/average/{number1}/{number2}")
    public Double average(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {
        numberValidation(number1);
        numberValidation(number2);
        return (convertToDouble(number1) + convertToDouble(number2))/2;
    }

    @RequestMapping("/squareroot/{number1}")
    public Double squareroot(@PathVariable("number1") String number1) throws Exception
    {
        numberValidation(number1);
        return Math.sqrt(convertToDouble(number1));
    }

}
