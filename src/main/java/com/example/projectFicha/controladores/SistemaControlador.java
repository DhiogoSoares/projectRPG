package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.entidades.Usuario;
import com.example.projectFicha.excecoes.UsuarioNaoEncontradoException;
import com.example.projectFicha.repositorios.SistemaRepositorio;
import com.example.projectFicha.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

public class SistemaControlador {

    //TODO: REVIEW

    @Autowired
    SistemaRepositorio repo;

    EntityManager em;

    @GetMapping
    public Iterable<Sistema> getSistemas(){
        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Sistema> criarSistema (@RequestBody Sistema sistema){
        return ResponseEntity.ok().body(repo.save(sistema));
    }


    //como fazer merge do usuario recebido pelo request body no usuario pegado pelo id?
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void alterarSistema(@PathVariable int id, @RequestBody Sistema sistema){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            em.merge(sistema); // necessario usar o merge ou posso usar o save??
        }
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSistema(@PathVariable int id, @RequestBody Sistema sistema){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            repo.delete(sistema); // assim?
        }
    }
}
