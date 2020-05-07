package com.example.projectFicha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {

    //Variable declarations
    @Id
    private int id;

    @Column(nullable = false)
    private String valor;

    @Column(nullable = false)
    private String nome;

    //Constructor
    public Grupo(int id, String valor, String nome) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
