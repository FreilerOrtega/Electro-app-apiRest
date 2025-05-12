package com.electro.electro_app.infraestructure.utilis.exception;

public class objectNotFoundException extends RuntimeException{
    public objectNotFoundException(){}

    public objectNotFoundException( String message){
        super(message);
    }
    
    public objectNotFoundException(String message,Throwable cause){
        super(message, cause);
    }
}
