package com.joaop_Cardoso.services;

import com.joaop_Cardoso.exception.UnsupportedMathOperatorException;

public abstract class ControllerValidations {

   public static boolean numberValidation(String strNumber) throws Exception{
       if(!isNumeric(strNumber))
       {
           throw new UnsupportedMathOperatorException("Not number");
       }
       return true;
   }

    private static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String strNumber) throws Exception
    {
        if(strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperatorException("Not number");
        }
        return Double.parseDouble(strNumber);
    }

}
