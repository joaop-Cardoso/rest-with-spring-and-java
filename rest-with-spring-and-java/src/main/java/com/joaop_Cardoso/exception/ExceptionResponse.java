package com.joaop_Cardoso.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
}
//classe template do json da response