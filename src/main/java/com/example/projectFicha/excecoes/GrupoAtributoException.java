package com.example.projectFicha.excecoes;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GrupoAtributoException extends RuntimeException {
    public GrupoAtributoException() {
    }

    public GrupoAtributoException(String message){
        super(message);

    }
}
