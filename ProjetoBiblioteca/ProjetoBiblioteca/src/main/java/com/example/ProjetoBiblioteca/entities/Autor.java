package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity

public class Autor {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Autor(Integer Id, String nome, String nacionalidade, Instant dataNascimento, String biografia){
        this.Id = Id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }

    public Autor() {
    }

    //GETTERS
    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Instant getDataNascimento() {
        return dataNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    //SETTERS
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setDataNascimento(Instant dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    private Integer Id;
    private String  nome;
    private String nacionalidade;
    private Instant dataNascimento;
    private String biografia;

}
