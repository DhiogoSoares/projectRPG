package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Grupo;
import com.example.projectFicha.repositorios.GrupoRepositorio;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping(value = "/{id}")
    public GrupoRepositorio findById(@PathVariable("id") int id){
        //return RestPreconditions.checkFound(service.findById(id));

        //CORRIGE ISSO DEPOIS
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int create(@RequestBody Grupo resource){
        Preconditions.checkNotNull(resource);
        //return service.create(resource);

        //CREATE DEU ERRADO AQUI TAMBÉM
        return Integer.parseInt(null);
    }

}
