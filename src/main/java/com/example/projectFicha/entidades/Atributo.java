package com.example.projectFicha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atributo")
public class Atributo {

    //Variable declarations
    @Id
    private int id;

    @Column (nullable = false)
    private String nome;

    //Constructor
    public Atributo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Getters and Setters
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


    @Override
    public String toString() {
        return "Atributo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
