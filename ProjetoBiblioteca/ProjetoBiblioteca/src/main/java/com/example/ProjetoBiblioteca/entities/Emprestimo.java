package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Emprestimo {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Emprestimo(Integer Id, Instant dataEmprestimo, Instant dataDevolucaoPrevista, Instant dataDevolucaoReal, String status, String livro, String usuario){
        this.Id = Id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoReal = dataDevolucaoReal;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Emprestimo() {
    }
    private Integer Id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;

}
