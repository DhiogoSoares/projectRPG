package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Grupo;
import com.example.projectFicha.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GrupoRepositorio extends CrudRepository<Grupo, Integer> {
    List<Grupo> Find();
}
