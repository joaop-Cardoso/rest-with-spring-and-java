package com.joaop_Cardoso.controllers;

import com.joaop_Cardoso.exception.ExceptionResponse;
import com.joaop_Cardoso.exception.UnsupportedMathOperatorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/math")
public class MathController {
    //http://localhost:8080/math

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable("number1") String number1, @PathVariable("number2")String number2) throws Exception
    {

        if(!(isNumeric(number1) && isNumeric(number2)))
        {
            throw new UnsupportedMathOperatorException("Not number");
        }
        return convertToDouble(number1) + convertToDouble(number2);
    }

    private Double convertToDouble(String strNumber) throws Exception
    {
        if(strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperatorException("Not number");
        }
        return Double.parseDouble(strNumber);
    }


    private boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
