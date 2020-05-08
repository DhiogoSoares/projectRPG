package com.example.projectFicha.repositorios;

import com.example.projectFicha.excecoes.UsuarioNaoEncontradoException;
import com.example.projectFicha.entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsuarioRepositorioJPA implements UsuarioRepositorio{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Usuario> buscarTodos() {
        TypedQuery <Usuario> typedQuery = em.createQuery( "select u from Usuario u", Usuario.class);
        return typedQuery.getResultList();
    }

    @Override
    public Usuario buscarPorId(int id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public void cadastrar(Usuario usuario) {
        em.persist(usuario);

    }

    @Override
    public void alterar(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void removerPorId(int id) {
        Usuario usuario = buscarPorId(id);
        if (usuario == null){
            throw new UsuarioNaoEncontradoException("Usuario não encontrado");
        }
        em.remove(usuario);
    }



}
