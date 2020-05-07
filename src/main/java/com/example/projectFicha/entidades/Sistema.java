package com.example.projectFicha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sistema")
public class Sistema {

    @Id
    private int id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private int idGrupo;

    public Sistema(int id, String nome, String descricao, int idGrupo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idGrupo = idGrupo;
    }

    public Sistema(int id, String nome, int idGrupo) {
        this.id = id;
        this.nome = nome;
        this.idGrupo = idGrupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }


    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", idGrupo=" + idGrupo +
                '}';
    }
}
