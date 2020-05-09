package com.example.projectFicha.excecoes;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class sistemaNaoEncontradoException extends RuntimeException {
    public sistemaNaoEncontradoException() {
    }

    public sistemaNaoEncontradoException (String message){
        super(message);
    }
}

