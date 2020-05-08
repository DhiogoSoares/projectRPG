package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Usuario;

import java.util.List;

public interface UsuarioRepositorio {

    List<Usuario> buscarTodos();
    Usuario buscarPorId(int id);

    void cadastrar (Usuario usuario);
    void alterar (Usuario usuario);
    void removerPorId (int id);
}
