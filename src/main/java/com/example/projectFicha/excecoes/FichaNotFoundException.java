package com.example.projectFicha.excecoes;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FichaNotFoundException extends RuntimeException {
    public FichaNotFoundException() {
    }

    public FichaNotFoundException(String message){
        super(message);

    }
}
