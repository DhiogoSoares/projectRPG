package com.example.projectFicha.controladores;

import com.example.projectFicha.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class UsuarioControlador {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
}
