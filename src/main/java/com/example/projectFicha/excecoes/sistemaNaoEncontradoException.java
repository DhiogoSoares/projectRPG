package com.example.projectFicha.excecoes;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SistemaNaoEncontradoException extends RuntimeException {
    public SistemaNaoEncontradoException() {
    }

    public SistemaNaoEncontradoException (String message){
        super(message);
    }
}

