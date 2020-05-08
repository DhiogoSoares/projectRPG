package com.example.projectFicha.repositorios;

import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.entidades.Sistema;
import com.example.projectFicha.excecoes.SistemaNaoEncontradoException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SistemaRepositorioJPA implements SistemaRepositorio {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Sistema> buscarTodos() {
        TypedQuery<Sistema> typedQuery = em.createQuery( "select s from Sistema s", Sistema.class);
        return typedQuery.getResultList();
    }

    @Override
    public Sistema buscarPorId(int id) {
        return em.find(Sistema.class, id);
    }

    @Override
    public void cadastrar(Sistema sistema) {
        em.persist(sistema);

    }

    @Override
    public void alterar(Sistema sistema) {
        em.merge(sistema);
    }

    @Override
    public void removerPorId(int id) {
        Sistema sistema = buscarPorId(id);
        if (sistema == null){
            throw new SistemaNaoEncontradoException("Sistema não encontrado");
        }
        em.remove(sistema);
    }
}
