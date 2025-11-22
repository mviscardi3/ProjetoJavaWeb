package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Categoria {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Categoria(Integer Id, String nome, String descicao, String livro){
        this.Id = Id;
        this.nome = nome;
        this.descicao = descicao;
        this.livro = livro;
    }
    // GETTERS
    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescicao() {
        return descicao;
    }

    public String getLivro() {
        return livro;
    }


    // SETTERS
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Categoria() {
    }
    private Integer Id;
    private String nome;
    private String descicao;
    private String livro;
}
