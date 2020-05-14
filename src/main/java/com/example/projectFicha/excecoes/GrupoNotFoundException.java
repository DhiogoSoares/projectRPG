package com.example.projectFicha.excecoes;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GrupoNotFoundException extends RuntimeException {
    public GrupoNotFoundException() {
    }

    public GrupoNotFoundException(String message){
        super(message);

    }
}
