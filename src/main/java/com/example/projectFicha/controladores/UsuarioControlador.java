package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Usuario;
import com.example.projectFicha.excecoes.UsuarioNaoEncontradoException;
import com.example.projectFicha.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin()
public class UsuarioControlador {

    //TODO: REVIEW

    @Autowired
    UsuarioRepositorio repo;

    EntityManager em;

    @GetMapping
    public Iterable<Usuario> getUsuarios(){
        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> criarUsuario (@RequestBody Usuario usuario){
            return ResponseEntity.ok().body(repo.save(usuario));
    }

    //como fazer merge do usuario recebido pelo request body no usuario pegado pelo id?
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void alterarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            em.merge(usuario); // necessario usar o merge ou posso usar o save??
        }
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            repo.delete(usuario); // assim?S
        }
    }
}
