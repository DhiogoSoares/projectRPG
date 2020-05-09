package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Grupo;
import com.example.projectFicha.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface GrupoRepositorio extends CrudRepository<Grupo, Integer> {
}
