package com.example.projectFicha;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupoatributo")
public class GrupoAtributo{

    //Variable declarations
    @Id
    private int id;

    @Column(nullable = false)
    private int idGrupoPai;

    @Column(nullable = false)
    private int idGrupoFilho;

    @Column(nullable = false)
    private int idAtributo;

    //Constructor
    public GrupoAtributo(int id, int idGrupoPai, int idGrupoFilho, int idAtributo) {
        this.id = id;
        this.idGrupoPai = idGrupoPai;
        this.idGrupoFilho = idGrupoFilho;
        this.idAtributo = idAtributo;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdGrupoPai() {
        return idGrupoPai;
    }

    public void setIdGrupoPai(int idGrupoPai) {
        this.idGrupoPai = idGrupoPai;
    }

    public int getIdGrupoFilho() {
        return idGrupoFilho;
    }

    public void setIdGrupoFilho(int idGrupoFilho) {
        this.idGrupoFilho = idGrupoFilho;
    }

    public int getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(int idAtributo) {
        this.idAtributo = idAtributo;
    }


    @Override
    public String toString() {
        return "com.example.projectFicha.GrupoAtributo{" +
                "id=" + id +
                ", idGrupoPai=" + idGrupoPai +
                ", idGrupoFilho=" + idGrupoFilho +
                ", idAtributo=" + idAtributo +
                '}';
    }
}
