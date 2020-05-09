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

    //TODO: UPDATE
    //TODO: DELETE


    //como fazer merge do usuario recebido revebido pelo request body no usuario pegado pelo id?
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void alterarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        if (!(repo.existsById(id))){
            throw new UsuarioNaoEncontradoException();
        } else {
            usuario.setId(id);
            em.merge(usuario);
        }
    }

    //@DeleteMapping(value = "/{id}")
    //@ResponseStatus(HttpStatus.OK)
    //public void deleteUsuario(@PathVariable int id)


}
