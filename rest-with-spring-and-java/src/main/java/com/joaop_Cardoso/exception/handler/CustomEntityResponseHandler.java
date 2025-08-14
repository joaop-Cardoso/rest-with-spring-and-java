package com.joaop_Cardoso.exception.handler;

import com.joaop_Cardoso.exception.ExceptionResponse;
import com.joaop_Cardoso.exception.UnsupportedMathOperatorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice //permite definir alguns métodos comuns para vários controllers
@RestController
public class CustomEntityResponseHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request)
    {
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                ex.getMessage(),
                request. getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }//metodo para tratar exceções genericas

    @ExceptionHandler(UnsupportedMathOperatorException.class) //responsável por definir um tratamento para exceções específicas
    public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception ex, WebRequest request)
    {
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                ex.getMessage(),
                request. getDescription(false)
        );
        // como o ResponseEntity está sendo do tipo ExceptionResponse, o objeto ResponseEntity irá retornar todos os atritutos
        // do tipo ExceptionResponse em json

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); //objeto de resposta, responseentity, retorna json
    }//metodo para tratar exceções genericas
}
