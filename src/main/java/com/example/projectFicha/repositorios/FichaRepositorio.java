package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Ficha;
import org.springframework.data.repository.CrudRepository;

public interface FichaRepositorio extends CrudRepository<Ficha, Integer> {
}
