package com.example.projectFicha.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ficha")
public class Ficha {

    @Id
    private int id;

    @Column(nullable = false)
    private int idSistema;

    @Column(nullable = false)
    private int idUsuario;

    @Column(nullable = false)
    private String nomeChar;

    public Ficha(int id, int idSistema, int idUsuario, String nomeChar) {
        this.id = id;
        this.idSistema = idSistema;
        this.idUsuario = idUsuario;
        this.nomeChar = nomeChar;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeChar() {
        return nomeChar;
    }

    public void setNomeChar(String nomeChar) {
        this.nomeChar = nomeChar;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "id=" + id +
                ", idSistema=" + idSistema +
                ", idUsuario=" + idUsuario +
                ", nomeChar='" + nomeChar + '\'' +
                '}';
    }
}
