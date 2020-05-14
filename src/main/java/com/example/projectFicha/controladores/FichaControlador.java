package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Ficha;
import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.excecoes.UsuarioNaoEncontradoException;
import com.example.projectFicha.repositorios.FichaRepositorio;
import com.example.projectFicha.repositorios.SistemaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;


@RestController
@RequestMapping("/ficha")
public class FichaControlador {

    //TODO: REVIEW

    @Autowired
    FichaRepositorio repo;

    EntityManager em;

    @GetMapping
    public Iterable<Ficha> getFichas(){
        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Ficha> criarFicha (@RequestBody Ficha ficha){
        return ResponseEntity.ok().body(repo.save(ficha));
    }


    //como fazer merge do usuario recebido pelo request body no usuario pegado pelo id?
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void alterarFicha(@PathVariable int id, @RequestBody Ficha ficha){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            em.merge(ficha); // necessario usar o merge ou posso usar o save??
        }
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSistema(@PathVariable int id, @RequestBody Ficha ficha){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            repo.delete(ficha); // assim?
        }
    }

}
