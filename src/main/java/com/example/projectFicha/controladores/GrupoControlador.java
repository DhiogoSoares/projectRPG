package com.example.projectFicha.controladores;

import com.example.projectFicha.entidades.Grupo;
import com.example.projectFicha.repositorios.GrupoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        //return .checkFound(service.findById(id));

        //CORRIGIR

        return null;
    }

}
