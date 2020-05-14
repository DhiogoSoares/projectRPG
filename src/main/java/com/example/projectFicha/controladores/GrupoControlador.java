package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Grupo;
import com.example.projectFicha.repositorios.GrupoRepositorio;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grupo")
public class GrupoControlador {

    @Autowired
    private GrupoRepositorio service;

    @GetMapping
    public Iterable<Grupo> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Grupo> create(@RequestBody Grupo grupo){
        return ResponseEntity.ok().body(service.save(grupo));
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GrupoRepositorio findById(@PathVariable("id") int id){
        //return RestPreconditions.checkFound(service.findById(id));

        //CORRIGE ISSO DEPOIS
        return null;
    }
}
