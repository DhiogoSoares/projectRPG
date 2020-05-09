package com.example.projectFicha.entidades;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private int Id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String senha;

    private String email;

    public Usuario(int id, String nome, String nickname, String senha, String email) {
        Id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.senha = senha;
        this.email = email;
    }

    public Usuario(int id, String nome, String nickname, String senha) {
        Id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.senha = senha;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", nickname='" + nickname + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
