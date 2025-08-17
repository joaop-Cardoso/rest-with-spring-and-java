package com.joaop_Cardoso.Math;

import static com.joaop_Cardoso.services.ControllerValidations.convertToDouble;

public abstract class SimpleOperations {

    public static Double sumOperation(String strNumber1, String strNumber2) throws Exception {
        return convertToDouble(strNumber1) + convertToDouble(strNumber1);
    }
    public static Double subtractionOperation(String strNumber1, String strNumber2) throws Exception {
        return convertToDouble(strNumber1) - convertToDouble(strNumber1);
    }
    public static Double divisionOperation(String strNumber1, String strNumber2) throws Exception {
        return convertToDouble(strNumber1) / convertToDouble(strNumber1);
    }
    public static Double multiplicationOperation(String strNumber1, String strNumber2) throws Exception {
        return convertToDouble(strNumber1) * convertToDouble(strNumber1);
    }
    public static Double averageOperation(String strNumber1, String strNumber2) throws Exception {
        return (convertToDouble(strNumber1) + convertToDouble(strNumber2)) / 2;
    }
    public static Double squareRootOperation(String strNumber) throws Exception {
        return (Math.sqrt(convertToDouble(strNumber))) ;
    }
}
