package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SistemaRepositorio extends CrudRepository<Sistema, Integer> {

}
