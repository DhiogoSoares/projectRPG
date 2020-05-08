package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.entidades.Usuario;

import java.util.List;

public interface SistemaRepositorio {

    List<Sistema> buscarTodos();
    Sistema buscarPorId(int id);

    void cadastrar (Sistema sistema);
    void alterar (Sistema sistema);
    void removerPorId (int id);
}
