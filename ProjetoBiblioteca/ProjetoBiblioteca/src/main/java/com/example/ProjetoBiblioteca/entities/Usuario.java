package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
public class Usuario {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Usuario(Integer Id, String nome, String cpf, String endereco, String telefone, String email, Instant dataCadastro, String emprestimoAtivo) {
        this.Id = Id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.emprestimoAtivo = emprestimoAtivo;

    }
    public Usuario() {
    }

    private Integer Id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Instant dataCadastro;
    private String emprestimoAtivo;
}
